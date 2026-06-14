package com.github.Gregorys2s.Parceiros.Enum;

public enum Estatus {
    REJEITADO("Rejeitado"),
    ESPERA("Em espera"),
    APROVADO("Aprovado");

    private final String valor;

    Estatus(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
