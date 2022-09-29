package POO_JAVA5.exercise_1.classes;

import java.util.Optional;

public abstract class VeiculoSocorrista{

    String salvaVidas;

    public VeiculoSocorrista(String salvaVidas) {
        this.salvaVidas = salvaVidas;
    }

    public String getSalvaVidas() {
        return salvaVidas;
    }
}
