package generics;

public class Caixa<T> { // Definir um nome entre <>, pode ser qualquer coisa

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return this.coisa;
    }

    // Classe genérica básica
    
}
