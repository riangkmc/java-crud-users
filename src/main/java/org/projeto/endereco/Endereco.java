package org.projeto.endereco;

import jakarta.persistence.*;
import org.projeto.config.Auditable;
import org.projeto.usuario.Usuario;

@Entity
@Table(name = "endereco")
public class Endereco  extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", length = 255)
    private String rua;

    @Column(name = "cidade", length = 64)
    private String cidade;

    @Column(name = "estado", length = 64)
    private String estado;

    @Column(name = "cep", length = 20)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    // Construtores
    public Endereco() {}

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() { return id; }


    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}