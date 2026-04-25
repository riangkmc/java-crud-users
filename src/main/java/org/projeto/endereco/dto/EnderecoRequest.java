package org.projeto.endereco.dto;

import org.projeto.endereco.Endereco;

public record EnderecoRequest(
        String rua,
        String cidade,
        String estado,
        String cep
) {
    public Endereco toEntity() {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        return endereco;
    }
}