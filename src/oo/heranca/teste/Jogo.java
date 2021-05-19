package oo.heranca.teste;

import oo.heranca.*;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(); // a simples criação da classe com extends, já funciona a herança, não sendo
        // necessário nenhuma criação de métodos.
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem vida -> " + monstro.vida);
        System.out.println("Heroi tem vida -> " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem vida -> " + monstro.vida);
        System.out.println("Heroi tem vida -> " + heroi.vida);
    }
}
