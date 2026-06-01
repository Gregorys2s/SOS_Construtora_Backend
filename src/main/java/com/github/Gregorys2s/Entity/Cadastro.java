package com.github.Gregorys2s.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cadastro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", nullable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "funcionario", columnDefinition = "TEXT")
    private String funcionario;

}
