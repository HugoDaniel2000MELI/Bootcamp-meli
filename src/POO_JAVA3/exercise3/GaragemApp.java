package POO_JAVA3.exercise3;


import POO_JAVA3.exercise3.classes.Garagem;
import POO_JAVA3.exercise3.classes.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class GaragemApp {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();


        listaVeiculos.add(new Veiculo("ford", "fiesta", 1000.0));
        listaVeiculos.add(new Veiculo("ford", "focus", 1200.0));
        listaVeiculos.add(new Veiculo("ford", "explorer", 2500.0));
        listaVeiculos.add(new Veiculo("fiat", "uno", 500.0));
        listaVeiculos.add(new Veiculo("chevrolet", "aveo", 1250.0));
        Garagem garagem = new Garagem("MA200", listaVeiculos);


//        garagem.listaVeiculo();
//        garagem.listaVeiculoOrdenadaPreco();
//        garagem.listaVeiculoOrdenadaMarca();
//          garagem.listaVeiculoFilterPreco("maior", 1000.0);
        System.out.println("Média de preço = " + garagem.mediaPrecoVeiculo());

    }
}