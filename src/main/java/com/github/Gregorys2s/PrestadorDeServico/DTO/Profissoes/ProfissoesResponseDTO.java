package com.github.Gregorys2s.PrestadorDeServico.DTO.Profissoes;

import com.github.Gregorys2s.PrestadorDeServico.Entity.Profissoes;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfissoesResponseDTO {
    private String profissao;

    public ProfissoesResponseDTO(Profissoes profissao) {
        this.profissao = profissao.getProfissoes(); // ou getNome()
    }

}
