package org.projeto.endereco.dto;

import org.projeto.endereco.Endereco;

public record EnderecoResponse(
        Long id,
        String rua,
        String cidade,
        String estado,
        String cep

) {
    public static EnderecoResponse fromEntity(Endereco endereco) {
        return new EnderecoResponse(
                endereco.getId(),
                endereco.getRua(),
                endereco.getCidade(),
                endereco.getEstado(),
                endereco.getCep()
        );
    }
}