package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Compra> compras = new ArrayList<>();


    public Cliente(String nome) {
        this.nome = nome;
    }

    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }


    public double obterTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.obterTotal();
        }

        return total;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Compra> getCompras() {
        return this.compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }


}
