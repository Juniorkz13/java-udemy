package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 8.0);
        Aluno a3 = new Aluno("Isa", 3.8);
        Aluno a4 = new Aluno("Tati", 9.3);
        Aluno a5 = new Aluno("Carla", 5.0);
        Aluno a6 = new Aluno("Julia", 10);
        Aluno a7 = new Aluno("Mara", 1.7);
        Aluno a8 = new Aluno("Julia", 10); // repetido

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct: "); // método utilizado para que não seja retornado valores duplicados. É necessário implementar EQUALS e HASHCODE
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip e Limit: "); // métodos utilzidados para PULAR elementos e especificar a quantidade de elementos que devem retornar (LIMITE)
        alunos.stream().distinct().skip(2).limit(4).forEach(System.out::println);

        System.out.println("\nTakeWhile: "); // método utilizado para retornar elementos ENQUANTO determinada contidção ocorre. Para de retornar quando um elemento não entra na condição.
                                            // mesmo que existam elementos após, que se encaixem na condição, eles NÃO serão retornados.
        alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
    }
    
}
