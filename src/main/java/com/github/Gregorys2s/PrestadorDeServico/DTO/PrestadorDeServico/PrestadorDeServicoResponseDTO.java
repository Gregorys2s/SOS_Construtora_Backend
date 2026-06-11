package com.github.Gregorys2s.PrestadorDeServico.DTO.PrestadorDeServico;


import com.github.Gregorys2s.Compartilhados.DTO.Cadastro.CadastroResponseDTO;

import com.github.Gregorys2s.Compartilhados.DTO.Endereco.EnderecoRequestDTO;

import com.github.Gregorys2s.PrestadorDeServico.DTO.Categoria.CategoriaPrestadorDeServicoResponseDTO;
import com.github.Gregorys2s.PrestadorDeServico.Entity.PrestadorDeServico;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrestadorDeServicoResponseDTO {
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String telefone;
    private String fotoUrl;
    private EnderecoRequestDTO endereco;
    private CadastroResponseDTO cadastro;
    private CategoriaPrestadorDeServicoResponseDTO categoria;

    public PrestadorDeServicoResponseDTO(PrestadorDeServico prestador){
        this.nome = prestador.getNome();
        this.cpf = prestador.getCpf();
        this.dataDeNascimento = prestador.getDataDeNascimento();
        this.telefone = prestador.getTelefone();
        this.fotoUrl = prestador.getFotoUrl();
        this.endereco = EnderecoRequestDTO.builder()
                .cep(prestador.getEndereco().getCep())
                .logradouro(prestador.getEndereco().getLogradouro())
                .numero(prestador.getEndereco().getNumero())
                .complemento(prestador.getEndereco().getComplemento())
                .bairro(prestador.getEndereco().getBairro())
                .cidade(prestador.getEndereco().getCidade())
                .estado(prestador.getEndereco().getEstado())
                .build();
        this.categoria = new CategoriaPrestadorDeServicoResponseDTO(prestador.getCategoria());
        this.cadastro = CadastroResponseDTO.builder()
                .funcionario(prestador.getCadastro().getFuncionario())
                .build();
    }
}
