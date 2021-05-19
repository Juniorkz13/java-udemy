package cursoLambdas.desafio;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import cursoLambdas.Produto;

public class Desafio {
    public static void main(String[] args) {
        
        Produto p = new Produto("Tablet", 3235.89, 0.13);

        BinaryOperator<Double> precoReal = (n1, n2) -> (n1 * (1 - n2));
        UnaryOperator<Double> imposto = valor -> valor >= 2500.0 ? valor * 1.085 : valor;
        UnaryOperator<Double> frete = valorFrete -> valorFrete >= 3000.0 ? valorFrete + 100 : valorFrete + 50;

        System.out.printf("Preço final: R$%.2f.", precoReal.andThen(imposto).andThen(frete).apply(p.getPreco(), p.getDesconto()));
    }
}
