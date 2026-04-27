package org.projeto.endereco;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.projeto.endereco.dto.EnderecoRequest;
import org.projeto.endereco.dto.EnderecoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
@Tag(name = "enderecos", description = "gerenciador de enderecos")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public List<EnderecoResponse> listarTodos() {
        return enderecoService.listarTodos();
    }

    @GetMapping("/{id}")
    public EnderecoResponse buscarPorId(@PathVariable Long id) {
        return enderecoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void removerEndereco(@PathVariable Long id){
        enderecoService.remover(id);
    }

    @DeleteMapping
    public void removerTodos(){
        enderecoService.removerTodos();}

    @PutMapping("/{id}")
    public EnderecoResponse atualizarTudo(@PathVariable Long id,@RequestBody EnderecoRequest enderecoRequest){
        return enderecoService.atualizar(id,enderecoRequest);
    }
}



