package POO_JAVA3.exercise1.cliente;

import POO_JAVA3.exercise1.transacoes.ConsultaSaldo;
import POO_JAVA3.exercise1.transacoes.Saque;

public class Cobrador extends Cliente{

    public Cobrador(String nome, String tipo) {
        super(nome, tipo);
    }


    public void saque(int n){
        if(n==1) {
            Saque.transacaoOk();
        } else {
            Saque.transacaoNaoOk();
        }
    }


    public void consultaSaldo(int n){
        if(n==1){
            ConsultaSaldo.transacaoOk();
        } else {
            ConsultaSaldo.transacaoNaoOk();
        }
    }


}
