package com.github.Gregorys2s.Dto.Parceiros;

import com.github.Gregorys2s.Dto.Cadastro.CadastroRequestDTO;
import com.github.Gregorys2s.Dto.Categoria.CategoriaRequestDto;
import com.github.Gregorys2s.Dto.Categoria.CategoriaResponseDTO;
import com.github.Gregorys2s.Dto.Endereco.EnderecoRequestDTO;
import com.github.Gregorys2s.Dto.Segmentos.SegmentoRequestDTO;
import com.github.Gregorys2s.Entity.Cadastro;
import com.github.Gregorys2s.Entity.Parceiros;
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
    private CategoriaResponseDTO categoria;
    private CadastroRequestDTO cadastro;


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
        this.categoria = new CategoriaResponseDTO(parceiro.getCategoria());
        this.cadastro = CadastroRequestDTO.builder()
                .funcionario(parceiro.getCadastro().getFuncionario())
                .build();
    }
}
