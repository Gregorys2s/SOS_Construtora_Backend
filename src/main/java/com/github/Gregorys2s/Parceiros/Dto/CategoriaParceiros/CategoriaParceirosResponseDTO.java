package com.github.Gregorys2s.Parceiros.Dto.CategoriaParceiros;
import com.github.Gregorys2s.Parceiros.Dto.Segmentos.SegmentoResponseDTO;
import com.github.Gregorys2s.Parceiros.Entity.CategoriaParceiros;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaParceirosResponseDTO {

    private boolean destaque;
    private List<SegmentoResponseDTO> segmentos;

    public CategoriaParceirosResponseDTO(CategoriaParceiros categoria) {
        this.destaque = categoria.isDestaque();

        this.segmentos = categoria.getSegmento()
                .stream()
                .map(SegmentoResponseDTO::new)
                .toList();
    }
}
