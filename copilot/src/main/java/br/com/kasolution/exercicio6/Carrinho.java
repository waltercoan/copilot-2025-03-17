package br.com.kasolution.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public List<Item> getItens() {
        return itens;
    }
}