package com.github.Gregorys2s.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cep", nullable = false, length = 8)
    private String cep;

    @Column(name = "logradouro", nullable = false, columnDefinition = "TEXT")
    private String logradouro;

    @Column(name = "numero", nullable = false, columnDefinition = "TEXT")
    private String numero;

    @Column(name = "complemento", columnDefinition = "TEXT")
    private String complemento;

    @Column(name = "bairro", nullable = false, columnDefinition = "TEXT")
    private String bairro;

    @Column(name = "cidade", nullable = false, columnDefinition = "TEXT")
    private String cidade;

    @Column(name = "estado", nullable = false, columnDefinition = "TEXT")
    private String estado;
}
