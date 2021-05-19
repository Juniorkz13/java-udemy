package oo.abstrato;

public class Cachorro extends Mamifero {
    
    @Override
    public String mamar() {
        return "Usando leite";
    }

    // @Override
    // public String mover() {
    //     return "Usando as patas";  // metodo definido como FINAL em mamifero e portanto nao pode ser sobescrito
    // }
}
