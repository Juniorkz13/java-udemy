package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		
		c1.cliente = "José";
		c1.addItem("Caneta", 5, 1.99);
		c1.addItem(new Item("Borracha", 2, 4.99));
		c1.addItem(new Item("Caderno", 2, 19.99));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
		
		
		

	}

}
