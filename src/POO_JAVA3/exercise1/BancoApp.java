package POO_JAVA3.exercise1;

import POO_JAVA3.exercise1.cliente.Basico;
import POO_JAVA3.exercise1.cliente.Cobrador;
import POO_JAVA3.exercise1.cliente.Executivo;

public class BancoApp {

    public static void main(String[] args) {
        Executivo cliente1 = new Executivo("Mariana", "Executivo");
        Basico cliente2 = new Basico("Gabriel", "Basico");
        Cobrador cliente3 = new Cobrador("Hugo", "Cobrador");

        cliente3.consultaSaldo(0);
//        cliente1.deposito(1);
//        cliente2.pagamento(1);
    }
}
