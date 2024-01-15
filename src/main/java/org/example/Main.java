package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Operacoes> filaOperacoes = new ArrayDeque<>();
        filaOperacoes.add(new Operacoes (2, 3, '+'));
        filaOperacoes.add(new Operacoes (14, 8, '-'));
        filaOperacoes.add(new Operacoes (5, 6, '*'));
        filaOperacoes.add(new Operacoes (2147483647, 2, '+'));
        filaOperacoes.add(new Operacoes (18, 3, '/')); //Implemente o calculo de divisao

        Calculadora calculadora = new Calculadora();


        while (!filaOperacoes.isEmpty())
        {
            Operacoes operacao = filaOperacoes.peek();
            calculadora.calcular(operacao);
            System.out.println(operacao.getValorA() + " " + operacao.getOperador() +  " " + operacao.getValorB() + " = " + operacao.getResultado());
            filaOperacoes.remove(operacao);
        }
    }
}
