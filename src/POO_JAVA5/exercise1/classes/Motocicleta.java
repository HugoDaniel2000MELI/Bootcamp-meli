package POO_JAVA5.exercise1.classes;

public class Motocicleta extends Veiculo{
    private int rodas = 2;


    public Motocicleta(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300.0, 2);
    }


    public int getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                super.toString() +
                ", rodas=" + rodas +
                '}';
    }
}
