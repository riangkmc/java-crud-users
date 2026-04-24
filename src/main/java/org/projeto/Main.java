package org.projeto;


import org.projeto.endereco.Endereco;
import org.projeto.usuario.Usuario;
import org.projeto.usuario.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

       /* Usuario usuario = new Usuario("marcio","marcioVitor@gmail.com","12345678919", LocalDate.of(1926,2,18));

        Endereco endereco1 = new Endereco("Rua da fil","Sao paulo","SP","249123232");
        Endereco endereco2 = new Endereco("Rua da te","Belo Horizonte","MG","243224322");

        usuario.adicionarEndereco(endereco1);
        usuario.adicionarEndereco(endereco2);

        System.out.println(usuario);

        UsuarioService usuarioService = context.getBean(UsuarioService.class);
        usuarioService.salvar(usuario);
*/


    }
}