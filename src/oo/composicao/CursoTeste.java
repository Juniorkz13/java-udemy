package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("José");
		Aluno aluno2 = new Aluno("Sarah");
		Aluno aluno3 = new Aluno("Waldir");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("C#");
		Curso curso3 = new Curso("NodeJS");

		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		curso1.addAluno(aluno3);

		curso2.addAluno(aluno2);
		curso2.addAluno(aluno3);

		curso3.addAluno(aluno1);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + ".");
			System.out.println("Meu nome é: " + aluno.nome + "\n");
		}
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Estou matriculado no curso " + curso2.nome + ".");
			System.out.println("Meu nome é: " + aluno.nome + "\n");
		}
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + ".");
			System.out.println("Meu nome é: " + aluno.nome + "\n");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
		} else {
			System.out.println("\nNão encontrou");
		}

	}

}
