package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operacoes {
    public int valorA;
    public char operador;
    public int valorB;
    public double resultado;

    public Operacoes(int valorA, int valorB, char operador) {
        this.setValorA(valorA);
        this.operador = operador;
        this.valorB = valorB;
    }
}
