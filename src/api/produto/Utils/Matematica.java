package api.produto.Utils;

public class Matematica {
    public static double calcularAcrescimo(double valor, double percentual){
        return valor * ((percentual/100) + 1);
    }
}
