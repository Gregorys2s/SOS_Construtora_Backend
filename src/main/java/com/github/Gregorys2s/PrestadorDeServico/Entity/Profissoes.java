package com.github.Gregorys2s.PrestadorDeServico.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profissoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profissoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "profissao")
    private String profissoes;
}
