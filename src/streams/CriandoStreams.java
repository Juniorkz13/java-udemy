package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    
    public static void main(String[] args) {
        
        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "C++ ", "Pyhton\n"); // Método estático
        langs.forEach(print);

        String[] maisLangs = { "Ruby ", "JS ", "PHP ", ".Net\n" }; // Formas diferentes de impressão
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print); // Formas diferentes de impressão

        Arrays.stream(maisLangs, 1, 3).forEach(print); // Pegou o elemento a partir do indice 1 e foi até o 3, porém 3 não entra na impressão.
        System.out.println();
        Arrays.stream(maisLangs, 0, 2).forEach(print); // Pegou o elemento a partir do indice 0 e foi até o 2, porém 2 não entra na impressão.
        System.out.println();

        List<String> outrasLangs = Arrays.asList("Perl ", "Go ", "C# ", "Rust\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); // Stream paralela, o comando foi executado simultaneamente.

        // Stream.generate(() -> "a").forEach(print); // Gera infinitamente o print (CUIDADO!)
        // Stream.iterate(0, n -> n + 1).forEach(print); // Gera infinitamente a função lambda criada. (CUIDADO!)
    }
}
