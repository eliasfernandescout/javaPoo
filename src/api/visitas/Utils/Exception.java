package api.visitas.Utils;

public class Exception {

    static final int idadeMinima = 18;

    public static int verificarIdadeMinima(int idade) {
        if (idade < idadeMinima) {
            System.out.println("Acesso Negado");
        } else {
            System.out.printf("Acesso liberado");
        }
        return idade;
    }

    public static void noRetrnVerificarIdade(int idade) {
        if (idade < idadeMinima) {
            System.out.println("Acesso Negado");
        } else {
            System.out.printf("Acesso liberado");
        }
    }
}



