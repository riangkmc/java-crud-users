package org.projeto.usuario;


import org.projeto.endereco.EnderecoResponse;
import java.time.LocalDate;
import java.util.List;

public class UsuarioResponse {

    private long id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
    private List<EnderecoResponse> enderecos;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<EnderecoResponse> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoResponse> enderecos) {
        this.enderecos = enderecos;
    }

}
