package com.github.Gregorys2s.Parceiros.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "segmento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Segmento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "segmentos")
    private String segmentos;

    @ManyToMany(mappedBy = "segmento")
    private List<CategoriaParceiros> categorias;
}
