package cursoLambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(50); // Chamará a função
                                                                                              // parOuImpar para o
                                                                                              // número 50 e então (andThen), chamará a função 
                                                                                              // oRsultadoE e então(andThen) chamará a função empolgado.

        System.out.println(resultadoFinal);
    }
}
