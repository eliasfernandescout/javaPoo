public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2022;
        meuCarro.cor = "Cinza";
        meuCarro.fabricante = "Toyota";
        meuCarro.modelo = "Toyota Corolla Cross";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2014;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "Fiat";
        seuCarro.modelo = "Punto Sporting";


        System.out.println(meuCarro.anoFabricacao);
        System.out.println(meuCarro.modelo);
        System.out.println(seuCarro.anoFabricacao + "-" + seuCarro.modelo);




    }
}
