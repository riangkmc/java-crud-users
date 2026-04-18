package org.projeto.endereco;

import jakarta.transaction.Transactional;

import org.projeto.endereco.Endereco;
import org.projeto.endereco.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository EnderecoRepository;


    public EnderecoService(EnderecoRepository EnderecoRepository) {
        this.EnderecoRepository = EnderecoRepository;
    }


    @Transactional
    public Endereco buscarPorId(Long id) {
        return EnderecoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereco não encontrado"));
    }
    public List<Endereco> listarTodos() {
        return EnderecoRepository.findAll();
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