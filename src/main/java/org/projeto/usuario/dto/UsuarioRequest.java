package org.projeto.usuario.dto;

import org.projeto.usuario.Usuario;

import java.time.LocalDate;

public record UsuarioRequest(
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento
) {
    public Usuario toEntity() {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setDataNascimento(dataNascimento);
        return usuario;
    }
}