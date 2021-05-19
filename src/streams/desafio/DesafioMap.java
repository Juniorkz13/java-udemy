package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        /*
        * 1. Número para string binária... 6 -> "110"
        * 2. Inverter a string... "110" -> "011"
        * 3. Converter de volta para inteiro... "011" -> 3
        */

        UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString(); // STRINGBUILDER usado para manipular STRINGS
        Function<String, Integer> converter = n -> Integer.parseInt(n, 2); // Convertendo STRING em INTEGER (binário, por isso o numero 2 no parametro)

        nums.stream().map(Integer::toBinaryString)
        .map(inverter)
        .map(converter)
        .forEach(System.out::println);
    }
    
}
