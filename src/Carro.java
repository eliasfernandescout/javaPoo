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
        double valorIpva = calcularIpva();
        System.out.printf("Tempo de uso (anos) %d%n", validadeCarro);
        System.out.printf("Valor de revenda: %6.3f%n", valorRevenda);
        System.out.printf("Valor do IPVA: %6.3f%n", valorIpva);

    }

    double calcularIpva(){
        double valorRevenda = calcularValorRevenda();
        double valorIpva = valorRevenda * 0.04;
        return valorIpva;
    }
    int calcularValidade(){
        int validade = 2022 - anoFabricacao;
        return validade;
    }
    double calcularValorRevenda() {
        int validadeCarro = calcularValidade();
        int vidaUtilAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilAnos) * (vidaUtilAnos - validadeCarro);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        return valorRevenda;
    }


}
