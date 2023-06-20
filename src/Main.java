public class Main {
    public static void main(String[] args) {

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Dante Mattos";

        System.out.println(pessoa2.nome);

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Punto";
        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2020;
        meuCarro.proprietario = pessoa2;
        meuCarro.precoCompra = 117.000;
        meuCarro.calcularValorRevenda();

        double valorRevenda = meuCarro.calcularValorRevenda();
        int validadeCarro = meuCarro.calcularValidade();

        System.out.printf("Tempo de uso (anos) %d%n", validadeCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);




    }
}
