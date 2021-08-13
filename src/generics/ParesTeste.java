package generics;

public class ParesTeste {
    public static void main(String[] args) {
        
        Pares <Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "José");
        resultadoConcurso.adicionar(3, "Lúcio");
        resultadoConcurso.adicionar(4, "Joana");
        resultadoConcurso.adicionar(3, "Luiza");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(3));
    }
}
