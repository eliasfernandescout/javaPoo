package api.folhaPagamento;

public class FolhaPagamento {
    String nome;
    double salario;

    public double calcularSalario(ContratoTrabalho contratoTrabalho, double percentualPorFilho) {
        double valorSalarioMensal = contratoTrabalho.horaNormal + contratoTrabalho.valorHoraExtra + percentualPorFilho;
        return valorSalarioMensal;

    }

}
