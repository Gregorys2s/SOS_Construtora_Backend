package com.github.Gregorys2s.Dto.Categoria;

import com.github.Gregorys2s.Dto.Segmentos.SegmentoRequestDTO;
import com.github.Gregorys2s.Entity.Categoria;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaRequestDto {

    private boolean destaque;
    private Integer ordemDeExibicao;
    private List<SegmentoRequestDTO> segmentos;
}
