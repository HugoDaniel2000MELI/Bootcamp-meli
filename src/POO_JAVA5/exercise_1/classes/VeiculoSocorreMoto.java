package POO_JAVA5.exercise_1.classes;

public class VeiculoSocorreMoto extends VeiculoSocorrista{

    public VeiculoSocorreMoto() {
        super("moto");
    }

    public void socorrer(Motocicleta moto) {
        System.out.println("Socorre " + super.getSalvaVidas() + moto.getPlaca());
    }
}
