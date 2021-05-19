package cursoLambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> { // Nesse tipo de função não é permitido tipos primitivos, por isso
                                                  // Double e não double. Esta função não necessita a criação da classe funcional.
            return x + y;
        };
        System.out.println(calc.apply(2.0, 3.0));
        
        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));
        
        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(10, 5));
    }
}
