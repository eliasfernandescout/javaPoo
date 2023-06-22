package api.consultorio;

public class MainConsultorio {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.nome = "Elias Fernandes";
        paciente.altura = 1.91;
        paciente.peso = 134;

        double imc = paciente.calcularIndiceMassaCorpotal();

        System.out.println("PACIENTE: "+ paciente.nome +"\nTEM O IMC DE: " + imc );

    }
}
