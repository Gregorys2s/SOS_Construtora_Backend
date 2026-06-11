package com.github.Gregorys2s.PrestadorDeServico.Controller;

import com.github.Gregorys2s.PrestadorDeServico.DTO.PrestadorDeServico.PrestadorDeServicoRequestDTO;
import com.github.Gregorys2s.PrestadorDeServico.DTO.PrestadorDeServico.PrestadorDeServicoResponseDTO;
import com.github.Gregorys2s.PrestadorDeServico.Entity.PrestadorDeServico;
import com.github.Gregorys2s.PrestadorDeServico.Service.PrestadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PrestadorDeServico")
public class PrestadorDeServicoController {

    PrestadorService service;

    public PrestadorDeServicoController(PrestadorService service) {
        this.service = service;
    }

    @PostMapping
    public PrestadorDeServicoRequestDTO criar(@RequestBody PrestadorDeServicoRequestDTO dto) {
        PrestadorDeServico prestador = service.crear(dto);

        return new PrestadorDeServicoRequestDTO();
    }

    @GetMapping
    public List<PrestadorDeServicoResponseDTO> obter ()
    {
        List<PrestadorDeServico> prestador = service.obterDados();
        return prestador.stream()
                .map(PrestadorDeServicoResponseDTO::new)
                .toList();

    }
}
