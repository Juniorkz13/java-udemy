package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 4.0);
        Aluno a3 = new Aluno("Isa", 3.8);
        Aluno a4 = new Aluno("Tati", 9.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // Retorna TRUE se o termo de verificação (predicado) aconteceu para todos os casos.
        System.out.println(alunos.stream().anyMatch(aprovado)); // Retorna TRUE se o termo de verificação (predicado) aconteceu para pelo menos um caso.
        System.out.println(alunos.stream().noneMatch(aprovado)); // Retorna TRUE se o termo de verificação (predicado) não aconteceu nenhuma vez.
    }
}
