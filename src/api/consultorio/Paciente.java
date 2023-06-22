package api.consultorio;

public class Paciente {
    String nome;
    double peso;
    double altura;

    double calcularIndiceMassaCorpotal() {
        double imcCalculado = peso / (altura * altura);

        return imcCalculado;
    }

}
