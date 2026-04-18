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

        /*Usuario usuario = new Usuario("Marcelo","MarceloeBraga@gmail.com","12345678912", LocalDate.of(1923,1,28));

        Endereco endereco1 = new Endereco("Rua da hel"," Lima duarte","MG","24912322");
        Endereco endereco2 = new Endereco("Rua da vis","Juiz de fora","MG","24322322");

        usuario.adicionarEndereco(endereco1);
        usuario.adicionarEndereco(endereco2);

        System.out.println(usuario);

        UsuarioService usuarioService = context.getBean(UsuarioService.class);
        usuarioService.salvar(usuario);
*/


    }
}