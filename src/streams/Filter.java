package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("José", 9.2);
        Aluno a3 = new Aluno("Maria", 6.3);
        Aluno a4 = new Aluno("Gil", 1.5);
        Aluno a5 = new Aluno("Ju", 9.5);
        Aluno a6 = new Aluno("Cami", 3.4);
        Aluno a7 = new Aluno("Juca", 7.1);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
        Predicate<Aluno> aprovado = a -> a.nota >= 6;
        Function<Aluno, String> mensagem = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";


        alunos.stream()
        // .filter(a -> a.nota >= 6) // Filtrou os alunos que possuem nota maior ou igual a 6
        // .map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!")
        .filter(aprovado) // Melhor forma de fazer
        .map(mensagem) // Melhor forma de fazer
        .forEach(System.out::println);
    }
}
