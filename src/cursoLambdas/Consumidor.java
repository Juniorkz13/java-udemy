package cursoLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caderno", 19.99, 0.10);
        Produto p2 = new Produto("Caneta", 4.99, 0.10);
        Produto p3 = new Produto("Tablet", 1999.99, 0.10);
        Produto p4 = new Produto("Mouse", 190.99, 0.10);
        Produto p5 = new Produto("Teclado", 450.99, 0.10);

        imprimirNome.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
