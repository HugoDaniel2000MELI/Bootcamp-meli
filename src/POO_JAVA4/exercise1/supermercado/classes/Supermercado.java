package POO_JAVA4.exercise1.supermercado.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Supermercado {
    List<Cliente> listaClientes;
    List<Fatura> listaFaturas;

    public Supermercado(List<Cliente> listaClientes, List<Fatura> listaFaturas) {
        this.listaClientes = listaClientes;
        this.listaFaturas = listaFaturas;
    }

    public void listaClientes(){
        listaClientes.forEach(System.out::println);
    }

    public void listarFaturasDeCliente(String ID){
        listaFaturas.stream()
                .filter(f -> f.getCliente().getID() == ID)
                .forEach(System.out::println);
    }

    private  void  removerFatura(Cliente cliente){
        final Fatura[] fatura = new Fatura[1];
        listaFaturas.stream()
                .filter(c -> c.getCliente().equals(cliente))
                .forEach(c -> fatura[0] = c);

        listaFaturas.remove(fatura);
    }

    public void removerCliente(String ID){
        Cliente cliente =  buscaCliente(ID);
        if(cliente != null){
            listaClientes.remove(cliente.getClass());
            removerFatura(cliente);
            System.out.println("Removido com sucesso");
        }
    }

    public Cliente buscaCliente(String ID){
        final Cliente[] cliente = new Cliente[1];
        listaClientes.stream()
                .filter( c -> Objects.equals(c.getID(), ID))
                .forEach(c -> cliente[0] = c);

        if (cliente[0] == null){
            System.out.println("Cliente não encontrado");
        } else {
            System.out.println(cliente[0]);
        }
        return cliente[0];
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "listaClientes=" + listaClientes +
                ", listaFaturas=" + listaFaturas +
                '}';
    }
}
