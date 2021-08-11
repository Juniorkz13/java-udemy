package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        
        // Caixa caixa = new Caixa(); // pode criar um objeto sem definir o tipo, mas não é a melhor prática
        Caixa<String> caixaA = new Caixa<>(); // cria um objeto com tipo definido, sem fazer nenhum cast
        caixaA.guardar("Segredo");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
