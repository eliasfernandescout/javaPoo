public class TesteReferencias {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Dante";

        Carro meuCarro = new Carro(); // A variavel nao armazena, mas sim faz referencia ao objeto
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = pessoa1;

    }

}
