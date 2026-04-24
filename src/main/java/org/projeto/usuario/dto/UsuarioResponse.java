package org.projeto.usuario.dto;

import org.projeto.endereco.dto.EnderecoResponse;
import org.projeto.usuario.Usuario;
import java.time.LocalDate;
import java.util.List;

public record UsuarioResponse(
        Long id,
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento,
        List<EnderecoResponse> enderecos
) {
    public static UsuarioResponse fromEntity(Usuario usuario) {
        List<EnderecoResponse> enderecos = usuario.getEnderecos().stream()
                .map(endereco -> EnderecoResponse.fromEntity(endereco))
                .toList();
        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCpf(),
                usuario.getDataNascimento(),
                enderecos
        );
    }

}
