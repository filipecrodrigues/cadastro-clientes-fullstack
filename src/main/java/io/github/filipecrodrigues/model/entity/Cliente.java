package io.github.filipecrodrigues.model.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Data /* cria getters e setters conctrutor padrão e o construtor com parametros*/
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)/* para o banco incrementar o ID*/
    private Integer id;

    @Column(nullable = false, length = 150)
    private  String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column
    private LocalDate dataCadastro;

    /*Getters e seters criados com o loobok*/
}
