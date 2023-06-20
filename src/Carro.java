public class Carro {
//    String fabricante = "BMW"; INICIAR VARIAVEL COM VALOR PADRAO

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
    double precoCompra;
    //CARRO TEM UM PROPRIETARIO DO TIPO PESSOA, ISSO SE CHAMA COMPOSICAO;

    double calcularValorRevenda() {
        int tempoUsoAnos = 2022 - anoFabricacao;
        int vidaUtilAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilAnos) * (vidaUtilAnos - tempoUsoAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        return valorRevenda;
    }


}
