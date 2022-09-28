package produtos;

public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(int diasParaVencer, String nome, double preco){
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    };

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (this.diasParaVencer == 3) {
            return super.calcular(quantidadeDeProdutos)/2;
        }
        if (this.diasParaVencer == 2) {
            return super.calcular(quantidadeDeProdutos)/3;
        }
        if (this.diasParaVencer == 1) {
            return super.calcular(quantidadeDeProdutos)/4;
        }
        return super.calcular(quantidadeDeProdutos);
    }

}
