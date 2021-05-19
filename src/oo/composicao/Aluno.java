package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>(); // o FINAL quer dizer que a lista será constante, irá
															// apontar para o mesmo endereço de memória, mas não os seus
															// elementos.

	Aluno(String nome) {
		this.nome = nome;
	}

	void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cursos=" + cursos + "]";
	}

	Curso obterCursoPorNome(String nome) {

		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}

		return null;
	}

}
