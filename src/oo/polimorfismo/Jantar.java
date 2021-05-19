package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        var convidado = new Pessoa(80);

        var ingrediente1 = new Arroz();
        var ingrediente2 = new Feijao();
        var sobremesa = new Sorvete();
        // var ingrediente3 = new Comida(0.15); // Tornando a classe COMIDA em abstrata,
        // nao pode ser instanciado um ingrediente genérico

        System.out.printf("Convidado antes de comer -> %.2fkg", convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        // convidado.comer(ingrediente3);

        System.out.printf("\nConvidado após comer -> %.2fkg", convidado.getPeso());

        convidado.comer(sobremesa);

        System.out.printf("\nConvidado após comer sobremesa -> %.2fkg", convidado.getPeso());
    }
}
