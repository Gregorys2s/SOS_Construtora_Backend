package com.github.Gregorys2s.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parceiros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Parceiros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_social",nullable = false)
    private String nome_social;

    @Column(name = "nome_fantasia")
    private String nome_fantasia;

    @Column(name = "cpnj", nullable = false, length = 14)
    private String cpnj;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private Integer telefone;

    @Column(name = "logo_url")
    private String logo_url;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cadastro_id")
    private Cadastro cadastro;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
