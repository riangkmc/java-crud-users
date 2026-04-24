package org.projeto.endereco;

import jakarta.transaction.Transactional;

import org.projeto.endereco.dto.EnderecoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository EnderecoRepository;


    public EnderecoService(EnderecoRepository EnderecoRepository) {
        this.EnderecoRepository = EnderecoRepository;
    }


    @Transactional
    public List<EnderecoResponse> listarTodos() {
        return EnderecoRepository.findAll().stream()
                .map(endereco -> EnderecoResponse.fromEntity(endereco)).toList();
    }

    @Transactional
    public EnderecoResponse buscarPorId(Long id) {
        Endereco endereco = EnderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereco não encontrado"));
        return EnderecoResponse.fromEntity(endereco);
    }


    public Endereco atualizar(Endereco Endereco) {
        return EnderecoRepository.save(Endereco);
    }

    public void remover(Long id) {
        if (!EnderecoRepository.existsById(id)) {
            throw new RuntimeException("Endereco não encontrado");
        }
        EnderecoRepository.deleteById(id);
    }

    public void removerTodos() {
        EnderecoRepository.deleteAll();
    }

}