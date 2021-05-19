package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>(); // uma compra possui varios itens.

	double getValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	void addItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void addItem(String nome, int quantidade, double valor) {
		this.addItem(new Item(nome, quantidade, valor));
	}

}
