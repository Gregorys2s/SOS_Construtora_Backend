package com.github.Gregorys2s.Repository;

import com.github.Gregorys2s.Entity.Segmento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SegmentoRepository extends JpaRepository<Segmento,Integer> {
    List<Segmento> findBySegmentosIn(List<String> segmentos);
}
