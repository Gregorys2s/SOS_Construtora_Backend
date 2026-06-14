package com.github.Gregorys2s.Parceiros.Enum;

import com.github.Gregorys2s.Parceiros.Entity.Segmento;

public enum SegmentosEnum {

    ELETRICISTA("Eletricista"),
    PEDREIRO("Pedreiro"),
    ENCANADOR("Encanador"),
    PINTOR("Pintor"),
    ENERGIA_SOLAR("Energia Solar"),
    CERAMICA_E_PORCELANATO("Cerâmica e Porcelanato"),
    REFORMA_E_CONSTRUCAO("Reforma e Construção"),
    VIDRACARIA("Vidraçaria"),
    GESSO_E_DRYWALL("Gesso e Drywall"),
    REFORMA_DE_TELHADO("Reforma de Telhado"),
    JARDINAGEM_E_PAISAGISMO("Jardinagem e Paisagismo"),
    TERRAPLANAGEM_E_LOCACAO("Terraplanagem e Locação"),
    PAVER("Paver"),
    CONSTRUCAO_DE_PISCINAS("Construção de Piscinas"),
    INSTALACAO_DE_GAS("Instalação de Gás"),
    POCO_ARTESIANO("Poço Artesiano"),
    METALURGICA("Metalúrgica"),
    CONCRETO_POLIDO("Concreto Polido"),
    PEDRAS_DECORATIVAS("Pedras Decorativas"),
    PORTAS("Portas"),
    SOFA_SOB_MEDIDA("Sofá Sob Medida"),
    LAGO_ARTIFICIAL("Lago Artificial"),
    PLAYGROUND("Playground");

    private final String descricao;

    SegmentosEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String ProcurarSegmento(String descricao) {
        for (SegmentosEnum segmento : values()) {
            if (segmento.getDescricao().equalsIgnoreCase(descricao)) {
                return segmento.getDescricao();
            }
        }

        throw new IllegalArgumentException(
                "Segmento não encontrado: " + descricao);
    }
}
