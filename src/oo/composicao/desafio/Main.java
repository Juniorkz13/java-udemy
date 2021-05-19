package oo.composicao.desafio;

public class Main {

    public static void main(String[] args) {

        var cliente = new Cliente("José");
        var produto1 = new Produto("Caneta", 1.99);
        var produto2 = new Produto("Caderno", 14.99);
        var produto3 = new Produto("Borracha", 3.99);

        var compra1 = new Compra();

        compra1.addItem(produto1, 5);
        compra1.addItem(produto2, 2);
        compra1.addItem(produto3, 1);

        var compra2 = new Compra();

        compra2.addItem(produto1, 1);
        compra2.addItem(produto2, 1);
        compra2.addItem(produto3, 1);

        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println("Cliente: " + cliente.getNome() + "\nGastou: R$" + cliente.obterTotal());

    }

}
