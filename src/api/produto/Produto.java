package api.produto;

public class Produto {
    double precoCusto;
    double precoVenda;

    static double custoEmbalagem; //static a variavel pertence a classe, podendo ter valor aqui mesmo

    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem; //altera a variavel static
        //todo o REFERID METODO NAO ALTERA O VALOR PARA CADA INSTANCIA, CASO O METODO SEJA INVOCADO 2X O ULTIMO SOBRESCREVE O PRIMEIRO

    }
    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

}
