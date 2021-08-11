package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // guardou tipo Double

        // Integer coisa = (Integer) caixaA.abrir(); // Cast perigoso, só funcionaria se o tipo do método abrir fosse int
        // System.out.println(coisa);
        Double coisa = (Double) caixaA.abrir(); // Aqui funciona, pois o tipo do método abrir é Double
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá"); // guardou tipo String
        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

        // estes métodos funcionam, mas não são interessantes, já que é sempre necessário especificar o tipo do parâmetro, caso contrário o Java vai dar erro
    }
}
