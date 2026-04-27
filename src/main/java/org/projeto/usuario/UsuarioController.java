package org.projeto.usuario;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.projeto.endereco.dto.EnderecoRequest;
import org.projeto.endereco.dto.EnderecoResponse;
import org.projeto.usuario.dto.UsuarioRequest;
import org.projeto.usuario.dto.UsuarioResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "usuarios", description = "gerenciador de usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UsuarioResponse> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("{id}/enderecos")
    public List<EnderecoResponse> listarEnderecosDoUsuario(@PathVariable Long id) {
        return usuarioService.listarEnderecos(id);
    }

    @Operation(summary = "Buscar usuário por ID", description = "Busca o usuario por id")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public UsuarioResponse buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UsuarioResponse criar(@RequestBody UsuarioRequest body){
        return usuarioService.salvar(body);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void removerUsuario(@PathVariable Long id){
        usuarioService.remover(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void removerTodos(){
        usuarioService.removerTodos();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public UsuarioResponse atualizarTudo(@PathVariable Long id, @RequestBody UsuarioRequest usuarioRequest){
        return usuarioService.atualizar(id,usuarioRequest);
    }

}
