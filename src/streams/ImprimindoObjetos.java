package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "José", "Maria", "João", "Iza");

        System.out.println("For:");
        for (int i = 0; i < aprovados.size(); i++) { // FOR
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nForEach:");
        for (String nome : aprovados) { // FOREACH
            System.out.println(nome);
        }

        System.out.println("\nIterator:");
        Iterator<String> iterator = aprovados.iterator(); // ITERATOR
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nStream:");
        Stream<String> stream = aprovados.stream(); // STREAM
        stream.forEach(System.out::println);
        // aprovados.stream().forEach(System.out::println); // forma menor
    }
}
