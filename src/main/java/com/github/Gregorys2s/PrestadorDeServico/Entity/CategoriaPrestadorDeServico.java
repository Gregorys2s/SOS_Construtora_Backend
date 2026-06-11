package com.github.Gregorys2s.PrestadorDeServico.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categoria_prestador_de_servico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaPrestadorDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "destaque", nullable = false)
    private boolean destaque;

    @Column(name = "ordem_de_exibicao", nullable = false)
    private Integer ordemDeExibicao;

    @ManyToMany
    @JoinTable(
            name = "categoria_profissoes",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "profissoes_id")
    )
    private List<Profissoes> profissao;
}
