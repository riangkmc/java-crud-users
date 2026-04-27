package org.projeto.usuario.dto;

import org.projeto.endereco.dto.EnderecoRequest;
import org.projeto.usuario.Usuario;

import java.time.LocalDate;
import java.util.List;

public record UsuarioRequest(
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento,
        List<EnderecoRequest> enderecos
) {
    public Usuario toEntity() {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setDataNascimento(dataNascimento);
        if (enderecos != null) {
            for (EnderecoRequest enderecoRequest : enderecos) {
                usuario.adicionarEndereco(enderecoRequest.toEntity());
            }
        }
        return usuario;
    }
}