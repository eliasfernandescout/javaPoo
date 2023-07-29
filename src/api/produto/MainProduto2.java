package api.produto;

public class MainProduto2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

//        Produto.custoEmbalagem = 20;
        Produto.alterarCustoEmbalagem(20);
        Produto.imprimirCustoEmbalagem();

    }
}
