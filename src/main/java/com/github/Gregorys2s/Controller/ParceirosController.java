package com.github.Gregorys2s.Controller;

import com.github.Gregorys2s.Dto.ParceirosRequestDTO;
import com.github.Gregorys2s.Dto.ParceirosResponseDTO;
import com.github.Gregorys2s.Service.ParceirosService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parceiros")
public class ParceirosController {

    ParceirosService service;

    public ParceirosController(ParceirosService parceiro) {
        this.parceiro = parceiro;
    }

    @PostMapping
    public ParceirosResponseDTO crear(@RequestBody ParceirosRequestDTO dto) {
        Parceiros parceiros = service.crear(dto);

        return new ParceirosResponseDTO(
                parceiros.getNome()
        );
    }

    @GetMapping
    public ParceirosResponseDTO obtener ()
    {
        Parceiros parceiros = service.obterDados(dto);

        return new ParceirosResponseDTO(
                parceiros.getNome()
        );
    }
}
