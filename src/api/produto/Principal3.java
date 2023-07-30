package api.produto;

public class Principal3 {
    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);
        Produto produto1 = new Produto();

        produto1.alterarPrecoCusto(100);

        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustosTotais(produto1)

        );

    }
}
