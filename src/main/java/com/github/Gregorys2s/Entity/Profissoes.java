package com.github.Gregorys2s.Entity;

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
    private Long id;

    @Column(name = "profissao")
    private String profissao;
}
