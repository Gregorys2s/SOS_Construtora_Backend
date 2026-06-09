package com.github.Gregorys2s.Dto.Categoria;
import com.github.Gregorys2s.Dto.Segmentos.SegmentoRequestDTO;
import com.github.Gregorys2s.Dto.Segmentos.SegmentoResponseDTO;
import com.github.Gregorys2s.Entity.Categoria;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaResponseDTO {

    private boolean destaque;
    private List<SegmentoResponseDTO> segmentos;

    public CategoriaResponseDTO(Categoria categoria) {
        this.destaque = categoria.isDestaque();

        this.segmentos = categoria.getSegmento()
                .stream()
                .map(SegmentoResponseDTO::new)
                .toList();
    }
}
