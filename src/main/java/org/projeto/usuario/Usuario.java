package org.projeto.usuario;

import jakarta.persistence.*;
import lombok.*;
import org.projeto.config.Auditable;
import org.projeto.endereco.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario extends Auditable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "cpf", nullable = false,unique = true,length = 11)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    public void adicionarEndereco(Endereco endereco){
        enderecos.add(endereco);
        endereco.setUsuario(this);
    }

    public void removerEndereco(Endereco endereco){
        enderecos.add(endereco);
        endereco.setUsuario(this);
    }

}
