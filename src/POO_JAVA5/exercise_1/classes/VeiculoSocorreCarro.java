package POO_JAVA5.exercise_1.classes;

public class VeiculoSocorreCarro extends VeiculoSocorrista{

    public VeiculoSocorreCarro() {
        super("Auto");
    }

//    public void socorre(Carro carro) {
//        System.out.println("Socorre carro" + carro.getPlaca());
//    }

    public void socorre(Carro carro) {
        System.out.println("Socorre " + super.getSalvaVidas() + " " + carro.getPlaca());
    }
}
