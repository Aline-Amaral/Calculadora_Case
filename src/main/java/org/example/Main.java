package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Operacoes> filaOperacoes = new ArrayDeque<>();
        filaOperacoes.add(new Operacoes (2, 3, '+'));
        filaOperacoes.add(new Operacoes (14, 8, '-'));
        filaOperacoes.add(new Operacoes (5, 6, '*'));
        filaOperacoes.add(new Operacoes (2147483647, 2, '+'));
        filaOperacoes.add(new Operacoes (18, 3, '/'));

        Calculadora calculadora = new Calculadora();

        Stack<Object> filaResultados = new Stack<>();

        while (!filaOperacoes.isEmpty())
        {
            Operacoes operacao = filaOperacoes.poll();
            calculadora.calcular(operacao);
            System.out.println(operacao.getValorA() + " " + operacao.getOperador() +  " " + operacao.getValorB() + " = " + operacao.getResultado());
            filaResultados.push(operacao.getResultado());
            filaOperacoes.iterator().forEachRemaining(item -> System.out.println("Operação remanescente: " + item.valorA + " " + item.operador +  " " + item.valorB));
        }

        filaResultados.iterator().forEachRemaining(item -> System.out.println("Resultado: " + item));
    }
}
