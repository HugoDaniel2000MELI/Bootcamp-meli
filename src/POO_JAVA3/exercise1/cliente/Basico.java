package POO_JAVA3.exercise1.cliente;

import POO_JAVA3.exercise1.transacoes.ConsultaSaldo;
import POO_JAVA3.exercise1.transacoes.Pagamento;
import POO_JAVA3.exercise1.transacoes.Saque;

public class Basico extends Cliente{
    public Basico(String nome, String tipo) {
        super(nome, tipo);
    }

    public void consultaSaldo(int n){
        if(n==1){
            ConsultaSaldo.transacaoOk();
        } else {
            ConsultaSaldo.transacaoNaoOk();
        }
    }
    public void saque(int n){
        if (n==1){
            Saque.transacaoOk();
        } else {
            Saque.transacaoNaoOk();
        }
    }

    public void pagamento(int n){
        if (n==1){
            Pagamento.transacaoOk();
        } else {
            Pagamento.transacaoNaoOk();
        }
    }

}
