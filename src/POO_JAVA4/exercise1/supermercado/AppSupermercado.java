package POO_JAVA4.exercise1.supermercado;

import POO_JAVA4.exercise1.supermercado.classes.Cliente;
import POO_JAVA4.exercise1.supermercado.classes.Fatura;
import POO_JAVA4.exercise1.supermercado.classes.Item;
import POO_JAVA4.exercise1.supermercado.classes.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class AppSupermercado {
    public static  void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        List<Item> itensHugo = new ArrayList<>();
        List<Item> itensMariana = new ArrayList<>();
        List<Item> itensGabriel = new ArrayList<>();

//        CLIENTES
        listaClientes.add(new Cliente("A7345b", "Hugo", "Daniel"));
        listaClientes.add(new Cliente("B73456", "Gabriel", "Fontes"));
        listaClientes.add(new Cliente("C8977a", "Mariana", "Saraiva"));

//        ITENS CLIENTES
        itensHugo.add(new Item("COD38", "leite", 7.50, 2 ));
        itensHugo.add(new Item("COD74", "arroz", 10.0, 1 ));

        itensGabriel.add(new Item("COD27", "laranja", 2.50, 6 ));
        itensGabriel.add(new Item("COD01", "feijão", 5.50, 3 ));

        itensMariana.add(new Item("COD07", "cenoura", 1.50, 7 ));
        itensMariana.add(new Item("COD74", "arroz", 10.0, 4 ));

//        listaClientes.remove(listaClientes.get().getID() == );

        List<Fatura> listaFatura = new ArrayList<>();

        listaFatura.add(new Fatura(listaClientes.get(0), itensHugo));
        listaFatura.add(new Fatura(listaClientes.get(1), itensMariana));
        listaFatura.add(new Fatura(listaClientes.get(2), itensGabriel));


        Supermercado supermercado = new Supermercado(listaClientes,listaFatura);

        supermercado.listaClientes();
        supermercado.buscaCliente("A7345b");
        supermercado.listarFaturasDeCliente("A7345b");
        supermercado.removerCliente("B73456");
        supermercado.buscaCliente("B73456");
        supermercado.listaClientes();
    }
}
