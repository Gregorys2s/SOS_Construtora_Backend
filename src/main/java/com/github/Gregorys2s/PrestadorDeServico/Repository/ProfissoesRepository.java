package com.github.Gregorys2s.PrestadorDeServico.Repository;

import com.github.Gregorys2s.PrestadorDeServico.Entity.Profissoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfissoesRepository extends JpaRepository<Profissoes,Integer> {
    List<Profissoes> findByProfissoesIn(List<String> profissao);
}
