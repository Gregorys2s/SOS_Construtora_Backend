package com.github.Gregorys2s.Compartilhados.Entidade;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cadastros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data", nullable = false, updatable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "funcionario", columnDefinition = "TEXT")
    private String funcionario;

    @PrePersist
    public void prePersist() {
        this.dataCadastro = LocalDateTime.now();
    }

}
