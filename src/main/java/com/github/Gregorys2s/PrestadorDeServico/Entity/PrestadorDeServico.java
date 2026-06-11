package com.github.Gregorys2s.PrestadorDeServico.Entity;

import com.github.Gregorys2s.Compartilhados.Entidade.Cadastro;
import com.github.Gregorys2s.Compartilhados.Entidade.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prestador_de_servico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PrestadorDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "data_de_nascimento", nullable = false)
    private LocalDate dataDeNascimento;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "foto_url")
    private String fotoUrl;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cadastro_id")
    private Cadastro cadastro;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaPrestadorDeServico categoria;
}
