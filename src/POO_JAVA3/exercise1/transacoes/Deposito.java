package POO_JAVA3.exercise1.transacoes;

public class Deposito extends Transacao{

    public static void transacaoOk() {
        System.out.println("Deposito realizado");;
    }


    public static void transacaoNaoOk() {
        System.out.println("Depósito não realizado");
    }
}
