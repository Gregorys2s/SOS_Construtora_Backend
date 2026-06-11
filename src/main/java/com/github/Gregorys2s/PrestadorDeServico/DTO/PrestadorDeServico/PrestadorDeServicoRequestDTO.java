package com.github.Gregorys2s.PrestadorDeServico.DTO.PrestadorDeServico;

import com.github.Gregorys2s.Compartilhados.DTO.Cadastro.CadastroRequestDTO;
import com.github.Gregorys2s.Compartilhados.DTO.Endereco.EnderecoRequestDTO;
import com.github.Gregorys2s.PrestadorDeServico.DTO.Categoria.CategoriaPrestadorDeServicoRequestDTO;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrestadorDeServicoRequestDTO {
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String telefone;
    private String fotoUrl;
    private EnderecoRequestDTO endereco;
    private CadastroRequestDTO cadastro;
    private CategoriaPrestadorDeServicoRequestDTO categoria;
}
