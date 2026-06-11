package com.github.Gregorys2s.Parceiros.Dto.CategoriaParceiros;

import com.github.Gregorys2s.Parceiros.Dto.Segmentos.SegmentoRequestDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaParceirosRequestDto {

    private boolean destaque;
    private Integer ordemDeExibicao;
    private List<SegmentoRequestDTO> segmentos;
}
