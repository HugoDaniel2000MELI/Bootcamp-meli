package POO_JAVA5.exercise1.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class Corrida {

    private int distancia;
    private double premioEmDolares;
    private String nome;
    private int numeroDeVeiculosPermitido;
    private List<Veiculo> listaVeiculos = new ArrayList<>();

    private VeiculoSocorreCarro salvaVidasCarro = new VeiculoSocorreCarro();

    private  VeiculoSocorreMoto salvaVidasMoto = new VeiculoSocorreMoto();

    public Corrida(int distancia, double premioEmDolares, String nome, int numeroDeVeiculosPermitido) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numeroDeVeiculosPermitido = numeroDeVeiculosPermitido;
    }

    public int getDistancia() {
        return distancia;
    }

    public double getPremioEmDolares() {
        return premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeVeiculosPermitido() {
        return numeroDeVeiculosPermitido;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void addCarro(int velocidade, int acelercao, int anguloGiro, String placa) {
        if (listaVeiculos.size() == numeroDeVeiculosPermitido) {
            System.out.println("Quantidade máxima permitida de veículos foi alcançada");
        } else {
            listaVeiculos.add(new Carro(velocidade, acelercao, anguloGiro, placa));
            System.out.println("Carro adicionado");
        }
    }

    public void addMoto(int velocidade, int acelercao, int anguloGiro, String placa) {
        if (listaVeiculos.size() == numeroDeVeiculosPermitido) {
            System.out.println("Quantidade máxima permitida de veículos foi alcançada");
        } else {
            listaVeiculos.add(new Motocicleta(velocidade, acelercao, anguloGiro, placa));
            System.out.println("Motocicleta adicionada");
        }
    }

    public void deleteVeiculo(Veiculo veiculo) {
        if (veiculo != null){
            listaVeiculos.remove(veiculo);
            System.out.println("Veículo removido");
        } else {
            System.out.println("Não foi possível deletar o veículo pois o mesmo não existe");
        }
    }

    public void deleteVeiculoComPlaca(String placa) {
        List<Veiculo> listaVeiculosClone = new CopyOnWriteArrayList<>(listaVeiculos);
        listaVeiculosClone.stream()
                .filter(v -> Objects.equals(v.getPlaca(), placa))
                .forEach(this::deleteVeiculo);
//
    }

    public String veiculoVencedor() {
        double maiorValor = 0.00;
        Veiculo veiculoVencendor = listaVeiculos.get(0);

        for (Veiculo v : listaVeiculos) {
            double valor = (v.getVelocidade() * v.getAceleracao() / 2) / (v.getAnguloGiro() * (v.getPeso() - v.getRodas() * 100));
            if (maiorValor < valor) {
                maiorValor = valor;
                veiculoVencendor = v;
            }
        }

        return veiculoVencendor.toString();
    }

//    public Veiculo buscarVeiculo(String placa){
//        final Veiculo[] veiculo = {null};
//        listaVeiculos.stream()
//                .filter(v -> v.getPlaca() == placa)
//                .forEach(v -> veiculo[0] = v);
//
//        return veiculo[0];
//    }

//    public void socorreAuto(String placa){
//        final Carro[] veiculo = new Carro[1];
//        listaVeiculos.stream()
//                .filter(v -> v.getPlaca() == placa)
//                .forEach(v -> veiculo[0] = v);
//
//        }
//    }


}
