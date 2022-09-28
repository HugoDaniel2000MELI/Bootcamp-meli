package POO_JAVA3.exercise3.classes;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Garagem {

    private String id;
    private List<Veiculo> listaVeiculos;

    public Garagem(String id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public String getId() {
        return id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void listaVeiculo(){
        listaVeiculos.forEach(v -> System.out.println(v));
    }

    public void listaVeiculoOrdenadaPreco(){
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(v -> System.out.println(v));
    }

    public void listaVeiculoOrdenadaMarca(){
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(v -> System.out.println(v));
    }

    public void listaVeiculoFilterPreco(String filtro, double preco){
        if(filtro == "menor"){
          listaVeiculos.stream()
                  .filter(v -> v.getPreco() < preco)
                  .forEach(System.out::println);
        } else {
            listaVeiculos.stream()
                    .filter(v -> v.getPreco() >= 1000)
                    .forEach(System.out::println);
        }
    }

    public OptionalDouble mediaPrecoVeiculo(){
        return listaVeiculos.stream().mapToDouble(Veiculo::getPreco).average();
    }

    @Override
    public String toString() {
        return "Garagem{" +
                "id='" + id + '\'' +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }
}
