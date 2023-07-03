package api.folhaPagamento;

public class FolhaPgtoMain {
    public static void main(String[] args) {
        ContratoTrabalho contrato1 = new ContratoTrabalho();
        FolhaPagamento folhaPagamento = new FolhaPagamento();


        contrato1.funcionario1.nome = "Elias Fernandes";
        double salarioFuncionario1 = contrato1.funcionario1.folhaPagamento.salario = 4000;
        int filhosFuncionario1 = contrato1.funcionario1.quantidadeFilhos = 4;
        contrato1.horaNormal = 24;
        contrato1.valorHoraExtra = 36;

        double calculoPercentual = contrato1.funcionario1.calcularPercentualFilhos(salarioFuncionario1, filhosFuncionario1);
        contrato1.funcionario1.folhaPagamento.calcularSalario(contrato1.funcionario1.contratoTrabalho, calculoPercentual);

    }
}
