package com.github.Gregorys2s.PrestadorDeServico.Service;

import com.github.Gregorys2s.Compartilhados.Repository.CadastroRepository;
import com.github.Gregorys2s.Compartilhados.Repository.EnderecoRepository;
import com.github.Gregorys2s.PrestadorDeServico.DTO.PrestadorDeServico.PrestadorDeServicoRequestDTO;
import com.github.Gregorys2s.PrestadorDeServico.DTO.Profissoes.ProfissoesRequestDTO;
import com.github.Gregorys2s.PrestadorDeServico.Entity.PrestadorDeServico;
import com.github.Gregorys2s.Compartilhados.Entidade.Cadastro;
import com.github.Gregorys2s.PrestadorDeServico.Entity.CategoriaPrestadorDeServico;
import com.github.Gregorys2s.Compartilhados.Entidade.Endereco;
import com.github.Gregorys2s.PrestadorDeServico.Entity.Profissoes;
import com.github.Gregorys2s.PrestadorDeServico.Repository.CategoriaPrestadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestadorService {

    PrestadorDeServicoRepository repository;
    CadastroRepository cadastroRepository;
    CategoriaPrestadorRepository categoriaRepository;
    ProfissoesRepository profissoesRepository;
    EnderecoRepository enderecoRepository;

    public PrestadorService(PrestadorDeServicoRepository repository, CadastroRepository cadastroRepository, CategoriaPrestadorRepository categoriaRepository, ProfissoesRepository profissoesRepository, EnderecoRepository enderecoRepository) {
        this.repository = repository;
        this.cadastroRepository = cadastroRepository;
        this.categoriaRepository = categoriaRepository;
        this.profissoesRepository = profissoesRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public PrestadorDeServico crear(PrestadorDeServicoRequestDTO dto) {
        Endereco endereco = enderecoRepository.save(Endereco.builder()
                .cep(dto.getEndereco().getCep())
                .bairro(dto.getEndereco().getBairro())
                .logradouro(dto.getEndereco().getLogradouro())
                .complemento(dto.getEndereco().getComplemento())
                .cidade(dto.getEndereco().getCidade())
                .numero(dto.getEndereco().getNumero())
                .estado(dto.getEndereco().getEstado())
                .build());

        List<String> nomesProfissao = dto.getCategoria()
                .getProfissoes()
                .stream()
                .map(ProfissoesRequestDTO::getProfissao)
                .toList();

        List<Profissoes> profissoes = profissoesRepository.findByProfissoesIn(nomesProfissao);

        CategoriaPrestadorDeServico categoria = categoriaRepository.save(
                CategoriaPrestadorDeServico.builder()
                        .profissao(profissoes)
                        .destaque(dto.getCategoria().isDestaque())
                        .ordemDeExibicao(dto.getCategoria().getOrdemDeExibicao())
                        .build()
        );

        Cadastro cadatro = cadastroRepository.save(
                Cadastro.builder()
                        .funcionario(dto.getCadastro().getFuncionario())
                        .build()
        );

        PrestadorDeServico prestador = PrestadorDeServico.builder()
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .dataDeNascimento(dto.getDataDeNascimento())
                .telefone(dto.getTelefone())
                .fotoUrl(dto.getFotoUrl())
                .cadastro(cadatro)
                .categoria(categoria)
                .endereco(endereco)
                .build();

        return repository.save(prestador);
    }

    public List<PrestadorDeServico> obterDados() {
        return repository.findAll();
    }
}
