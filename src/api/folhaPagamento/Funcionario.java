package api.folhaPagamento;

public class Funcionario {
    String nome;
    int quantidadeFilhos;
    double quantidadeHorasExtras;
    ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
    FolhaPagamento folhaPagamento = new FolhaPagamento();

    public double calcularPercentualFilhos(double salario, int quantidadeFilhos){
        double adicionalPorFilho = salario*quantidadeFilhos/100;
        return adicionalPorFilho;
    }




}
