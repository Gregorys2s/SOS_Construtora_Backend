package com.github.Gregorys2s.Dto.Segmentos;

import com.github.Gregorys2s.Dto.Segmentos.SegmentoRequestDTO;
import com.github.Gregorys2s.Entity.Categoria;
import com.github.Gregorys2s.Entity.Segmento;
import lombok.*;

import java.util.List;

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
