package org.example;

public class Calculadora {
    public Operacoes calcular(Operacoes operacao)
    {
        switch(operacao.operador)
        {
            case '+': operacao.resultado= soma(operacao);break;
            case '-': operacao.resultado = subtracao(operacao);break;
            case '*': operacao.resultado = multiplicacao(operacao);break;
            case '/': operacao.resultado = divisao(operacao);break;
            default: operacao.resultado = 0; break;
        }
        return operacao;
    }
    public Long soma(Operacoes operacao)
    {
        return (long) operacao.valorA + operacao.valorB;
    }
    public int subtracao(Operacoes operacao)
    {
        return operacao.valorA - operacao.valorB;
    }
    public Long multiplicacao(Operacoes operacao)
    {
        return (long) operacao.valorA * operacao.valorB;
    }
    public double divisao(Operacoes operacao)
    {
        return (double) operacao.valorA / operacao.valorB;
    }
}
