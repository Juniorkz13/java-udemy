package cursoLambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Juca", "Jão", "Zé");

        System.out.println("Forma tradicional do forEach:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // System.out.println("\nLambda #01:");
        // aprovados.forEach((nome) -> {
        // System.out.println(nome + "!!");
        // }); // para cada NOME -> execute a função. OBS: os parentesis em (nome), não
        // são
        // // necessários pois só existe 1 parâmetro. OBS2: como há somente uma função,
        // as
        // // chaves {} também nao sao necessárias.

        System.out.println("\nLambda #01:");
        aprovados.forEach(nome -> System.out.println(nome + "!!"));

        System.out.println("\nMethod Reference #01:");
        aprovados.forEach(System.out::println); // passando a referência de um método, mais simplificado ainda. Para
                                                // cada aprovado chame o system.out.println. OBS: nessa opção há menos
                                                // espaço para personalização, não é possível editar a saída como no
                                                // anterior onde adicionei "!!".
        System.out.println("\nLambda #02:");
        aprovados.forEach(nome -> meuImprimir(nome)); // fazendo um método, é possível editar a forma de saída

        System.out.println("\nMethod reference #02:");
        aprovados.forEach(ForEach::meuImprimir); // utilizando o método para imprimir personalizado na referência de um
                                                 // método
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
