package generics;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> lista) { // não é um método interessante, pois a depender do tipo da lista,
                                                     // será necessário fazer o cast do objeto
        return lista.get(lista.size() - 1);
    }

    public static <T> T getUltimo2(List<T> lista) { // aqui o método é mais interessante, pois não é necessário fazer o
                                                    // cast do objeto
        return lista.get(lista.size() - 1);
    }

    public static <A, B, C> C teste(A paramA, B paramB) { // exemplo genérico onde já é definidos os tipos de parâmetros e retornos
        C teste = null;
        return teste;
    }
}
