package org.projeto.endereco;


import org.projeto.endereco.dto.EnderecoRequest;
import org.projeto.endereco.dto.EnderecoResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
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

    /*@PostMapping
    public String criar(@RequestBody EnderecoRequest body){
        return enderecoService.;
    }*/
}
