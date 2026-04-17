package org.projeto.usuario;

import jakarta.transaction.Transactional;

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
        return UsuarioRepository.save(Usuario);
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