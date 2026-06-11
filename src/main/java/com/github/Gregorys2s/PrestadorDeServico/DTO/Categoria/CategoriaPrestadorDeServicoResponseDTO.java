package com.github.Gregorys2s.PrestadorDeServico.DTO.Categoria;

import com.github.Gregorys2s.PrestadorDeServico.DTO.Profissoes.ProfissoesResponseDTO;
import com.github.Gregorys2s.PrestadorDeServico.Entity.CategoriaPrestadorDeServico;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaPrestadorDeServicoResponseDTO {
    private boolean destaque;
    private List<ProfissoesResponseDTO> profissoes;

    public CategoriaPrestadorDeServicoResponseDTO(CategoriaPrestadorDeServico categoria) {
        this.destaque = categoria.isDestaque();

        this.profissoes = categoria.getProfissao()
                .stream()
                .map(ProfissoesResponseDTO::new)
                .toList();
    }
}
