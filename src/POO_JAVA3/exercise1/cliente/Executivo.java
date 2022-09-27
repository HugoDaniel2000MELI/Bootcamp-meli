package POO_JAVA3.exercise1.cliente;

import POO_JAVA3.exercise1.transacoes.Deposito;
import POO_JAVA3.exercise1.transacoes.Transferencia;

public class Executivo extends Cliente{
    public Executivo(String nome, String tipo) {
        super(nome, tipo);
    }

    public void deposito(int n){
        if(n==1){
            Deposito.transacaoOk();
        } else {
            Deposito.transacaoNaoOk();
        }
    }

    public void transferencia(int n){
        if(n==1){
            Transferencia.transacaoOk();
        } else {
            Transferencia.transacaoNaoOk();
        }
    }
}
