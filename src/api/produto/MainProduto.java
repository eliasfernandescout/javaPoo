package api.produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
//        double precoCompraFornecedor = 140;
        novoProduto.precoCusto = 100;

        ServicoPrecificacao servicoPrecificacao = new ServicoPrecificacao();
        servicoPrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preco de venda: %.2f%n ", novoProduto.precoVenda);

    }
}
