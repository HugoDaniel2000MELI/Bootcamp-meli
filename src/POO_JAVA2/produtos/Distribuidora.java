package produtos;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        Produto produto1 = new Pereciveis(4, "queijo", 15.00);
        Produto produto2 = new Pereciveis(3, "leite", 7.00);

        Produto produtoNP1 = new NaoPereciveis("natural", "feijão", 7.00);
        Produto produtoNP2 = new NaoPereciveis("industrial", "macarrão", 6.00);

        List<ItemVenda> itensVenda = new ArrayList<>();

        itensVenda.add(new ItemVenda(produto1, 2));
        itensVenda.add(new ItemVenda(produto2, 3));
        itensVenda.add(new ItemVenda(produtoNP1,1));
        itensVenda.add(new ItemVenda(produtoNP2, 3));

        double valorTotal = 0;
        for(ItemVenda iv: itensVenda){
            valorTotal += iv.getProduto().calcular(iv.getQuantidade());
        }
        System.out.println("Total = " + valorTotal);
    }
}
