package com.github.Gregorys2s.Service;

import com.github.Gregorys2s.Dto.ParceirosRequestDTO;
import com.github.Gregorys2s.Entity.*;
import com.github.Gregorys2s.Repository.ParceirosRepository;
import org.springframework.stereotype.Service;

@Service
public class ParceirosService {

    ParceirosRepository repository;

    public ParceirosService(ParceirosRepository repository) {
        this.repository = repository;
    }

    public Parceiros crear(ParceirosRequestDTO dto)
    {

        Endereco endereco = Endereco.builder()
                .cep(dto.getEndereco().getCep())
                .bairro(dto.getEndereco().getBairro())
                .logradouro(dto.getEndereco().getLogradouro())
                .complemento(dto.getEndereco().getComplemento())
                .cidade(dto.getEndereco().getCidade())
                .numero(dto.getEndereco().getNumero())
                .estado(dto.getEndereco().getEstado())
                .build();

        Profissoes profissao = Profissoes.builder()
                .profissao(dto.getCategoria().getProfissoes().getProfissao())
                .build();

        Categoria categoria = Categoria.builder()
                .profissao(profissao)
                .destaque(dto.getCategoria().isDestaque())
                .ordemDeExibicao(dto.getCategoria().getOrdemDeExibicao())
                .build();

        Cadastro cadastro = Cadastro.builder()
                .funcionario(dto.getCadastro().getFuncionario())
                .build();

       Parceiros parceiros = Parceiros.builder()
               .nomeSocial(dto.getNomeSocial())
               .nomeFantasia(dto.getNomeFantasia())
               .cnpj(dto.getCnpj())
               .email(dto.getEmail())
               .telefone(dto.getTelefone())
               .logo_url(dto.getLogo_url())
               .endereco(endereco)
               .categoria(categoria)
               .cadastro(cadastro)
               .build();

       repository.save(parceiros);
       return parceiros;
    }
}
