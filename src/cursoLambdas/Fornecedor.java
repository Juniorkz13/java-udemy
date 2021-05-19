package cursoLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Jão", "Zé", "Bia", "Lu"); // como não recebe nenhum parâmetro, é obrigatorio o uso de ()

        System.out.println(umaLista.get());
    }
}
