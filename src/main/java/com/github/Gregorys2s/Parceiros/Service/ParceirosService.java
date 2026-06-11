package com.github.Gregorys2s.Parceiros.Service;

import com.github.Gregorys2s.Compartilhados.Repository.CadastroRepository;
import com.github.Gregorys2s.Compartilhados.Repository.EnderecoRepository;
import com.github.Gregorys2s.Parceiros.Dto.Parceiros.ParceirosRequestDTO;
import com.github.Gregorys2s.Parceiros.Dto.Segmentos.SegmentoRequestDTO;
import com.github.Gregorys2s.Parceiros.Entity.Parceiros;
import com.github.Gregorys2s.Compartilhados.Entidade.Cadastro;
import com.github.Gregorys2s.Parceiros.Entity.CategoriaParceiros;
import com.github.Gregorys2s.Compartilhados.Entidade.Endereco;
import com.github.Gregorys2s.Parceiros.Entity.Segmento;
import com.github.Gregorys2s.Parceiros.Repository.CategoriaParceirosRepository;
import com.github.Gregorys2s.Parceiros.Repository.ParceirosRepository;
import com.github.Gregorys2s.Parceiros.Repository.SegmentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParceirosService {

    ParceirosRepository repository;
    CadastroRepository cadastroRepository;
    CategoriaParceirosRepository categoriaRepository;
    SegmentoRepository segmentoRepository;
    EnderecoRepository enderecoRepository;

    public ParceirosService(ParceirosRepository repository, CadastroRepository cadastroRepository, CategoriaParceirosRepository categoriaRepository, SegmentoRepository segmentoRepository, EnderecoRepository enderecoRepository) {
        this.repository = repository;
        this.cadastroRepository = cadastroRepository;
        this.categoriaRepository = categoriaRepository;
        this.segmentoRepository = segmentoRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public Parceiros crear(ParceirosRequestDTO dto) {

        Endereco endereco = enderecoRepository.save(Endereco.builder()
                .cep(dto.getEndereco().getCep())
                .bairro(dto.getEndereco().getBairro())
                .logradouro(dto.getEndereco().getLogradouro())
                .complemento(dto.getEndereco().getComplemento())
                .cidade(dto.getEndereco().getCidade())
                .numero(dto.getEndereco().getNumero())
                .estado(dto.getEndereco().getEstado())
                .build());

        List<String> nomesSegmentos = dto.getCategoria()
                .getSegmentos()
                .stream()
                .map(SegmentoRequestDTO::getSegmentos)
                .toList();

        List<Segmento> segmentos = segmentoRepository.findBySegmentosIn(nomesSegmentos);

        CategoriaParceiros categoria = categoriaRepository.save(
                CategoriaParceiros.builder()
                        .segmento(segmentos)
                        .destaque(dto.getCategoria().isDestaque())
                        .ordemDeExibicao(dto.getCategoria().getOrdemDeExibicao())
                        .build()
        );

        Cadastro cadastro = cadastroRepository.save(
                Cadastro.builder()
                        .funcionario(dto.getCadastro().getFuncionario())
                        .build());

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

        return repository.save(parceiros);


    }

    public List<Parceiros> obterDados() {
        return repository.findAll();
    }
}


