package com.github.Gregorys2s.Dto.Parceiros;
/*CREATE TABLE parceiros (
  id SERIAL PRIMARY KEY,
  nome_social VARCHAR(50) NOT NULL,
  nome_fantasia text not null,
  cnpj CHAR(14) NOT NULL,
  email text not null,
  telefone VARCHAR(20) NOT NULL,
  logo_url text
);*/

import com.github.Gregorys2s.Dto.Cadastro.CadastroRequestDTO;
import com.github.Gregorys2s.Dto.Categoria.CategoriaRequestDto;
import com.github.Gregorys2s.Dto.Endereco.EnderecoRequestDTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParceirosRequestDTO {
    private String nomeSocial;
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String telefone;
    private String logo_url;
    private EnderecoRequestDTO endereco;
    private CategoriaRequestDto categoria;
    private CadastroRequestDTO cadastro;
}
