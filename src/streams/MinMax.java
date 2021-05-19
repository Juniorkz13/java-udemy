package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 4.0);
        Aluno a3 = new Aluno("Isa", 3.8);
        Aluno a4 = new Aluno("Tati", 9.3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> { // compara objetos.
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota)); // .max, recebe como parâmetro um comparador, retorna o maior valor.
        System.out.println(alunos.stream().min(melhorNota)); // .min, recebe como parâmetro um comparador, retorna o menor valor.
    }
}
