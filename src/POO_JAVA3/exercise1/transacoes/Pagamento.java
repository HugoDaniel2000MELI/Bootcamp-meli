package POO_JAVA3.exercise1.transacoes;

public class Pagamento extends Transacao {

    public static void transacaoOk() {
        System.out.println("Pagamento realizado");;
    }


    public static void transacaoNaoOk() {
        System.out.println("Pagamento não realizado");
    }
}
