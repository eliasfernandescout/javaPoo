package api.consultorio;

public class Paciente {
    String nome;
    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorpotal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
