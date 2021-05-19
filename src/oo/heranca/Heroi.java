package oo.heranca;

public class Heroi extends Jogador { // Herança

    // public boolean atacar(Jogador oponente) { // pode ser sobrescrito copiando
    // todo o código, mas não é o melhor método;

    // int deltaX = Math.abs(x - oponente.x);
    // int deltaY = Math.abs(y - oponente.y);

    // if (deltaX == 0 && deltaY == 1) {
    // oponente.vida -= 20;
    // return true;
    // } else if (deltaX == 1 && deltaY == 0) {
    // oponente.vida -= 20;
    // return true;
    // } else {
    // return false;
    // }
    // }

    public boolean atacar(Jogador oponente) { // outra forma de sobrescrever é chamar a função SUPER.
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;

    }

}
