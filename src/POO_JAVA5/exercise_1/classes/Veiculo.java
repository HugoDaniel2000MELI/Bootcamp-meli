package POO_JAVA5.exercise_1.classes;

public abstract class Veiculo {
    private int velocidade;
    private  int aceleracao;
    private int anguloGiro;
    private String placa;

    private double peso;

    private int rodas;

    public Veiculo(int velocidade, int aceleracao, int anguloGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public int getAnguloGiro() {
        return anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloGiro=" + anguloGiro +
                ", peso=" + peso +
                ", rodas=" + rodas +
                ", placa='" + placa + '\''
                ;
    }


}
