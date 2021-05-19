package cursoLambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String funciona() { // um método DEFAULT não inviabiliza a interface funcional
        return "FUNCIONA!";
    }

    static String funcionaTambem() { // um método STATIC também não inviabiliza a interface funcional
        return "TAMBÉM FUNCIONA!";
    }

}
