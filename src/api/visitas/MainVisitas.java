package api.visitas;

import api.produto.Utils.Matematica;
import api.visitas.Utils.Exception;

public class MainVisitas {
    public static void main(String[] args) {

        Visitante novoVisitante = new Visitante();

        novoVisitante.nome = "Dante Mattos Fernandes";
        novoVisitante.idade = 5;

//        String acesso = novoVisitante.idade < Visitante.IDADE_MINIMA ? "Acesso Negado" : "Acesso Liberado";

        int idadeVerificada = Exception.verificarIdadeMinima(novoVisitante.idade);

        System.out.println(idadeVerificada);

    }
}
