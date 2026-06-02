package com.github.Gregorys2s.Service;

import com.github.Gregorys2s.Dto.ParceirosRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class ParceirosService {
    public ParceirosService crear(ParceirosRequestDTO dto)
    {
       ParceirosService parceiro = new Parceiros(
               dto.getNomeSocial(),
               dto.getNomeFantasia(),
               dto.getCnpj(),
               dto.getEmail(),
               dto.getTelefone(),
               dto.getLogo_url()
       );

       return parceiro;
    }
}
