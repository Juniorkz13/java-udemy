package excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeDoALuno(a1);
        } catch (Exception e) {
            System.out.println("ocorreu um errro no momento de imprimir o nome do aluno");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace(); // imprime onde o erro aconteceu
            System.out.println(e.getMessage()); // imprime onde o erro aconteceu
        }

        System.out.println("FIM");
    }

    public static void imprimirNomeDoALuno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
