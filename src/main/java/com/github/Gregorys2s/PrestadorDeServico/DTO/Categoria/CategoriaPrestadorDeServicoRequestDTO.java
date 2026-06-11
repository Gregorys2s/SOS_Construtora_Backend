package com.github.Gregorys2s.PrestadorDeServico.DTO.Categoria;

import com.github.Gregorys2s.PrestadorDeServico.DTO.Profissoes.ProfissoesRequestDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaPrestadorDeServicoRequestDTO {
    private boolean destaque;
    private Integer ordemDeExibicao;
    private List<ProfissoesRequestDTO> profissoes;

}
