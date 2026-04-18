package org.projeto.endereco;

import jakarta.persistence.*;
import org.projeto.usuario.Usuario;
public class EnderecoResponse {


    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;




    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() { return id; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }


}