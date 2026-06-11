package com.github.Gregorys2s.Parceiros.Dto.Parceiros;

import com.github.Gregorys2s.Compartilhados.DTO.Cadastro.CadastroResponseDTO;
import com.github.Gregorys2s.Parceiros.Dto.CategoriaParceiros.CategoriaParceirosResponseDTO;
import com.github.Gregorys2s.Compartilhados.DTO.Endereco.EnderecoRequestDTO;
import com.github.Gregorys2s.Parceiros.Entity.Parceiros;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParceirosResponseDTO {
    private String nomeSocial;
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String telefone;
    private String logo_url;
    private EnderecoRequestDTO endereco;
    private CategoriaParceirosResponseDTO categoria;
    private CadastroResponseDTO cadastro;


    public ParceirosResponseDTO(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public ParceirosResponseDTO(Parceiros parceiro) {
        this.nomeSocial = parceiro.getNomeSocial();
        this.nomeFantasia = parceiro.getNomeFantasia();
        this.cnpj = parceiro.getCnpj();
        this.email = parceiro.getEmail();
        this.telefone = parceiro.getTelefone();
        this.logo_url = parceiro.getLogo_url();
        if (parceiro.getEndereco() != null) {
            this.endereco = EnderecoRequestDTO.builder()
                    .cep(parceiro.getEndereco().getCep())
                    .logradouro(parceiro.getEndereco().getLogradouro())
                    .numero(parceiro.getEndereco().getNumero())
                    .complemento(parceiro.getEndereco().getComplemento())
                    .bairro(parceiro.getEndereco().getBairro())
                    .cidade(parceiro.getEndereco().getCidade())
                    .estado(parceiro.getEndereco().getEstado())
                    .build();
        }
        this.categoria = new CategoriaParceirosResponseDTO(parceiro.getCategoria());
        this.cadastro = CadastroResponseDTO.builder()
                .funcionario(parceiro.getCadastro().getFuncionario())
                .build();
    }
}
