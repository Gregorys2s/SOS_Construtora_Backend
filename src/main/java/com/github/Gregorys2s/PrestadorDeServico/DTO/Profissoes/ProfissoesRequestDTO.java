package com.github.Gregorys2s.PrestadorDeServico.DTO.Profissoes;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ProfissoesRequestDTO {
    private String profissao;

    public ProfissoesRequestDTO(String profissao) {
        this.profissao = profissao;
    }
}
