package org.projeto.usuario;

import org.projeto.usuario.dto.UsuarioRequest;
import org.projeto.usuario.dto.UsuarioResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioResponse> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public UsuarioResponse buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }
    @PostMapping
    public Usuario criar(@RequestBody UsuarioRequest body){
        return usuarioService.salvar(body);
    }

}
