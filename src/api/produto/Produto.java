package api.produto;

public class Produto {
    double precoCusto;
    double precoVenda;
    static double custoEmbalagem; //static a variavel pertence a classe, podendo ter valor aqui mesmo

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
}
