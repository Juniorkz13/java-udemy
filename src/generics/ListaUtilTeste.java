package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java", "JS", "C++", "C#");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs); // por isso o método não é tão interessante, é
                                                                       // necessário fazer o cast do objeto
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs); // neste caso não foi necessário fazer o cast do objeto
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);

    }
}
