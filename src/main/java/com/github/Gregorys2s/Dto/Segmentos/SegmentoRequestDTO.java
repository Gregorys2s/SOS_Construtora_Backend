package com.github.Gregorys2s.Dto.Segmentos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class SegmentoRequestDTO {
    private String segmentos;

    public SegmentoRequestDTO(String segmentos) {
        this.segmentos = segmentos;
    }
}
