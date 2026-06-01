package com.github.Gregorys2s.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profissao_id", nullable = false)
    private Profissoes profissao;

    @Column(name = "destaque", nullable = false)
    private boolean destaque;

    @Column(name = "ordem_de_exibicao", nullable = false)
    private Integer ordemDeExibicao;
}
