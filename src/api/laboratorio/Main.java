package api.laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Exame> exames = new ArrayList<>();
//        exames.add(new Exame("1", "Hemograma", "Contagem de celulas sanguineas", 100.00));

        Laboratorio laboratorio = new Laboratorio("Laboratorio de Analises Clinicas", "Rua dos Bobos, 0",
                "1234-5678", "laboratorio@email.com", "123.456.789/0001-00", "Dr. Fulano",
                "Analises Clinicas", exames);

        laboratorio.agendarExame("4", "Teste de Covid", "Teste de Covid", 150.00);
        laboratorio.agendarExame("5", "Teste de Glicose", "Teste de Glicose", 50.00);
        laboratorio.agendarExame("6", "Teste de Colesterol", "Teste de Colesterol", 70.00);
        laboratorio.imprimirExames();

        exames.stream().filter(exame -> exame.getId().equals("6")).findFirst().ifPresent(exame -> exame.setValor(500.00));
        laboratorio.cancelarExame("5");
        laboratorio.imprimirExames();
    }
}