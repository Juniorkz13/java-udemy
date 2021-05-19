package oo.heranca.teste;

import oo.heranca.desafio.*;

public class Main {
    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        System.out.println("Velocidade Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Velocidade Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);

        civic.frear();
        civic.frear();
        civic.frear();
        ferrari.frear();
        
        System.out.println("Velocidade Civic: " + civic.velocidadeAtual);
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);
        ferrari.ligarTurbo();
        ferrari.acelerar();
        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);
    }
}
