package org.projeto.usuario;

import jakarta.transaction.Transactional;

import org.projeto.usuario.dto.UsuarioRequest;
import org.projeto.usuario.dto.UsuarioResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository UsuarioRepository;


    public UsuarioService(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }


    public UsuarioResponse salvar(UsuarioRequest usuarioRequest) {
        Usuario tempUser = usuarioRequest.toEntity();
        UsuarioRepository.save(tempUser);
        return UsuarioResponse.fromEntity(tempUser);
    }

    @Transactional
    public List<UsuarioResponse> listarTodos() {
        return UsuarioRepository.findAll().stream()
                .map(usuario -> UsuarioResponse.fromEntity(usuario)).toList();
    }

    @Transactional
    public UsuarioResponse buscarPorId(Long id) {
        Usuario usuario = UsuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        return UsuarioResponse.fromEntity(usuario);
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