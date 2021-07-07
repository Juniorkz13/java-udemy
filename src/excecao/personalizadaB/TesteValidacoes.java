package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            Validar.aluno(null);

            // } catch (StringVaziaException e) {
            // System.out.println(e.getMessage()); // Pode ser feito com vários CATCH ou um
            // pipe como abaixo!
            // } catch (NumeroForaIntervalo e) {
            // System.out.println(e.getMessage());
            // }
        } catch (StringVaziaException | NumeroForaIntervalo | IllegalArgumentException e) { // Segunda forma de ser
                                                                                            // feito o CATCH, em pipe
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }

}
