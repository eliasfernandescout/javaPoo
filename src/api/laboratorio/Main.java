package api.laboratorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Laboratorio laboratorio = new Laboratorio("Laboratorio de Analises Clinicas", "Rua dos Bobos, 0",
                "1234-5678", "laboratorio@email.com", "123.456.789/0001-00", "Dr. Fulano",
                "Analises Clinicas");

        laboratorio.agendarExame("4", "Teste de Covid", "Teste de Covid", 150.00);
        laboratorio.agendarExame("5", "Teste de Glicose", "Teste de Glicose", 50.00);
        laboratorio.agendarExame("6", "Teste de Colesterol", "Teste de Colesterol", 70.00);
//        laboratorio.imprimirExames();

//        System.out.println("------------------------------");

//        laboratorio.cancelarExame("5");
//        laboratorio.imprimirExames();

        List<String> examesId = laboratorio.getExames().stream()
                .map(Exame::getId)
                .collect(Collectors.toList());
        System.out.println(examesId);

        List<Double> valorExames = laboratorio.getExames().stream()
                .map(exame-> exame.getValor() * 5)
                .collect(Collectors.toList());

        System.out.println(valorExames);
        System.out.println("----");
        valorExames.forEach(System.out::println);



    }
}