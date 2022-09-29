package POO_JAVA5.exercise_1.classes;

public class Carro extends Veiculo{

    public Carro(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 1000.0, 4);
    }


    @Override
    public String toString() {
        return "Carro{" +
                super.toString() +
                '}';
    }
}
