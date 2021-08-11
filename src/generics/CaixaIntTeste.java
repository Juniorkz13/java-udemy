package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        
        CaixaInt caixaA = new CaixaInt(); // não foi necessário passar o tipo do objeto pois na classe CaixaInt é definido
        caixaA.guardar(13);
        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
