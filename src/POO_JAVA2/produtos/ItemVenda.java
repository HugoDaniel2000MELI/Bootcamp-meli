package POO_JAVA2.produtos;

public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantido){
        this.produto = produto;
        this.quantidade = quantido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
