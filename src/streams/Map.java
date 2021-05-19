package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        // UnaryOperator<String> maiscula = n -> n.toUpperCase(); // chamando função a partir da classe.
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        // UnaryOperator<String> grito = n -> n + "!!! "; // chamando pela METHOD REFERENCE (referência de método)

        System.out.println("\n\nUsando composição:");
        marcas.stream()
        .map(Utilitarios.maiscula) // chamando a função a partir da classe.
        .map(primeiraLetra)
        .map(Utilitarios::grito) // chamando pela METHOD REFERENCE (referência de método)
        .forEach(print);
    }
}
