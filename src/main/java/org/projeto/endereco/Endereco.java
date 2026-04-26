package org.projeto.endereco;

import jakarta.persistence.*;
import lombok.*;
import org.projeto.config.Auditable;
import org.projeto.usuario.Usuario;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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


}