package com.github.Gregorys2s.Parceiros.Controller;

import com.github.Gregorys2s.Parceiros.Dto.Parceiros.ParceirosRequestDTO;
import com.github.Gregorys2s.Parceiros.Dto.Parceiros.ParceirosResponseDTO;
import com.github.Gregorys2s.Parceiros.Entity.Parceiros;
import com.github.Gregorys2s.Parceiros.Service.ParceirosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parceiros")
public class ParceirosController {

    ParceirosService service;

    public ParceirosController(ParceirosService parceiro) {
        this.service = parceiro;
    }

    @PostMapping
    public ParceirosResponseDTO criar(@RequestBody ParceirosRequestDTO dto) {
        Parceiros parceiros = service.criar(dto);

        return new ParceirosResponseDTO(
                parceiros.getNomeSocial()
        );
    }

    @GetMapping
    public List<ParceirosResponseDTO> obter()
    {
        List<Parceiros> parceiros = service.obterDados();
        return parceiros.stream()
                .map(ParceirosResponseDTO::new)
                .toList();

    }

}
