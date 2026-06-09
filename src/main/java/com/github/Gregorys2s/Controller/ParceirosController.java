package com.github.Gregorys2s.Controller;

import com.github.Gregorys2s.Dto.ParceirosRequestDTO;
import com.github.Gregorys2s.Dto.ParceirosResponseDTO;
import com.github.Gregorys2s.Entity.Parceiros;
import com.github.Gregorys2s.Service.ParceirosService;
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
    public ParceirosResponseDTO crear(@RequestBody ParceirosRequestDTO dto) {
        Parceiros parceiros = service.crear(dto);

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

    //exemplo especifico de como pegar dados
//    @GetMapping("/nomes")
//    public List<String> listarNomes() {
//        return service.obterDados()
//                .stream()
//                .map(Parceiros::getNomeSocial)
//                .toList();
//    }
}
