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
    private Integer id;

    @Column(name = "nome_social",nullable = false)
    private String nomeSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "cnpj", nullable = false, length = 14)
    private String cnpj;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "logo_url")
    private String logo_url;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cadastro_id")
    private Cadastro cadastro;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
