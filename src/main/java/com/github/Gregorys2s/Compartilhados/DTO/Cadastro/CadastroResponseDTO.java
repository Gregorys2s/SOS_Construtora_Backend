package com.github.Gregorys2s.Compartilhados.DTO.Cadastro;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class CadastroResponseDTO {
    private String funcionario;

    public CadastroResponseDTO(String funcionario) {
        this.funcionario = funcionario;
    }
}
