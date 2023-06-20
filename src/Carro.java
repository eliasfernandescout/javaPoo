public class Carro {
//    String fabricante = "BMW"; INICIAR VARIAVEL COM VALOR PADRAO

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
    double precoCompra;
    //CARRO TEM UM PROPRIETARIO DO TIPO PESSOA, ISSO SE CHAMA COMPOSICAO;


    void imprimirResumoValidade(){
        int validadeCarro = calcularValidade();
        double valorRevenda = calcularValorRevenda();
        System.out.printf("Tempo de uso (anos) %d%n", validadeCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

    }
    int calcularValidade(){
        int validade = 2022 - anoFabricacao;
        return validade;
    }
    double calcularValorRevenda() {
//        int tempoUsoAnos = 2022 - anoFabricacao;
        int validadeCarro = calcularValidade();
        int vidaUtilAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilAnos) * (vidaUtilAnos - validadeCarro);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        return valorRevenda;
    }


}
