package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public void addItem(Produto pdt, int qtd) {
        this.itens.add(new Item(pdt, qtd));
    }

    public double obterTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.getQuantidade() * item.getProduto().getPreco();
        }

        return total;
    }

}
