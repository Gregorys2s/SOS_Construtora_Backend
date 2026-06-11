package com.github.Gregorys2s.Parceiros.Dto.Segmentos;

import com.github.Gregorys2s.Parceiros.Entity.Segmento;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SegmentoResponseDTO {

    private String nome;

    public SegmentoResponseDTO(Segmento segmento) {
        this.nome = segmento.getSegmentos(); // ou getNome()
    }
    }
