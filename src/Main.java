public class Main {
    public static void main(String[] args) {

//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.nome = "Elias Fernandes";
//        pessoa1.cpf = "147.314.467-16";
//        pessoa1.anoNascimento = 1991;
//
//        Carro meuCarro = new Carro();
//        meuCarro.anoFabricacao = 2022;
//        meuCarro.cor = "Cinza";
//        meuCarro.fabricante = "Toyota";
//        meuCarro.modelo = "Toyota Corolla Cross";
//        meuCarro.proprietario = pessoa1;
////        meuCarro.proprietario = new Pessoa();
////        meuCarro.proprietario.nome = "Elias Fernandes";
////        meuCarro.proprietario.cpf ="147.314.467-16";
//
//        Carro seuCarro = new Carro();
//        seuCarro.anoFabricacao = 2014;
//        seuCarro.cor = "Branco";
//        seuCarro.fabricante = "Fiat";
//        seuCarro.modelo = "Punto Sporting";
//        seuCarro.proprietario = new Pessoa();
//        seuCarro.proprietario.nome = "Jhessiny Mattos";
//        seuCarro.proprietario.cpf="155.798.387-94";
//
//        System.out.println(meuCarro.anoFabricacao + " - " + meuCarro.modelo + " - " + meuCarro.proprietario.nome);
//
//
//        System.out.println(seuCarro.anoFabricacao + " - " + seuCarro.modelo + " - " + seuCarro.proprietario);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Dante Mattos";

        System.out.println(pessoa2.nome);

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Punto";
        meuCarro.cor = "Branco";
        meuCarro.anoFabricacao = 2014;
        meuCarro.proprietario = pessoa2;

        System.out.println(meuCarro.proprietario.nome);




    }
}
