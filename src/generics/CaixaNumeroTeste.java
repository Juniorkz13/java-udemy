package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        // CaixaNumero<String> caixaA = new CaixaNumero<>(); // Não é possível criar um objeto que não pertença aos tipos da classe Number
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(13.5);
        Double coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(13);
        Integer coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }
}
