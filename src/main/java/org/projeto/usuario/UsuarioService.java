package org.projeto.usuario;

import jakarta.transaction.Transactional;

import org.projeto.endereco.Endereco;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository UsuarioRepository;


    public UsuarioService(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }
 

    public Usuario salvar(Usuario Usuario) {
        try {
            return UsuarioRepository.save(Usuario);
        } catch (Exception e) {
            throw new RuntimeException("erro ao salvar usuario!");
        }

    }

    public UsuarioResponse toResponse(Usuario usuario){
        UsuarioResponse dto = new UsuarioResponse();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getNome());
        dto.setDataNascimento(usuario.getDataNascimento());

        return dto;
    }


    public List<UsuarioResponse> listarTodos() {
        return UsuarioRepository.findAll().stream()
                .map(usuario -> this.toResponse(usuario)).toList();
    }

    @Transactional
    public Usuario buscarPorId(Long id) {
        return UsuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public Usuario atualizar(Usuario Usuario) {
        return UsuarioRepository.save(Usuario);
    }

    public void remover(Long id) {
        if (!UsuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario não encontrado");
        }
        UsuarioRepository.deleteById(id);
    }

    public void removerTodos() {
        UsuarioRepository.deleteAll();
    }
    
}