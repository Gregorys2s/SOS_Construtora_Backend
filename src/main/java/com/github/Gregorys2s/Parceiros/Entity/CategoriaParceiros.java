package com.github.Gregorys2s.Parceiros.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categoria_parceiros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CategoriaParceiros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "destaque", nullable = false)
    private boolean destaque;

    @Column(name = "ordem_de_exibicao", nullable = false)
    private Integer ordemDeExibicao;

    @ManyToMany
    @JoinTable(
            name = "categoria_segmento",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "segmento_id")
    )
    private List<Segmento> segmento;
}
