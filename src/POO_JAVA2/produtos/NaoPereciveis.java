package produtos;

public class NaoPereciveis extends Produto {
    String tipo;

    public NaoPereciveis(String tipo, String nome, double preco){
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
