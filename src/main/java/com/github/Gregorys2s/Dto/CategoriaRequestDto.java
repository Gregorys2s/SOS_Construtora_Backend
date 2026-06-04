package com.github.Gregorys2s.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaRequestDto {
    private ProfissoesRequestDTO profissoes;
    private boolean destaque;
    private Integer ordemDeExibicao;
}
