package cursoLambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y; // OUTRA FORMA -> quando não coloca as chaves, obrigatoriamente o que foi
                                // escrito é retornado!
        System.out.println(calc.executar(2, 3));
        System.out.println(calc.funciona());
        System.out.println(Calculo.funcionaTambem());
    }
}
