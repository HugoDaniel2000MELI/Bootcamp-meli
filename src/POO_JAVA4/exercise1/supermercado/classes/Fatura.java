package POO_JAVA4.exercise1.supermercado.classes;

import java.util.List;

public class Fatura {

    private Cliente cliente;
    private List<Item> listaItens;

    public Fatura(Cliente cliente, List<Item> listaItens) {
        this.cliente = cliente;
        this.listaItens = listaItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double valorFatura(){
        final double[] valorTotal = {0};
        listaItens.stream()
                .forEach(item -> valorTotal[0] += item.getPreco() * item.getQuantidade());

        return valorTotal[0];
    }

    @Override
    public String toString() {
        return "Faturas{" +
                "cliente=" + cliente +
                ", listaItens=" + listaItens +
                ", valorFatura=" + this.valorFatura() +
                '}';
    }
}
