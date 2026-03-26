package com.github.Gregorys2s;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor//isso é obrigatorio pro JPA funcionar
@AllArgsConstructor//pode ser removido vc decide gregory
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String profissao;
    private String telefone;
    private String nome;
}