package api.consultorio;

public class MainConsultorio {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.nome = "Elias Fernandes";
        paciente.altura = 1.91;
        paciente.peso = 134;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorpotal();

        if(imc.resultado >= 30){
            System.out.printf("Paciente com altura %.2f e peso de %.2f " + "esta com obesidade\n", imc.altura, imc.peso);
        }

        System.out.println("PACIENTE: "+ paciente.nome +"\nTEM O IMC DE: " + imc.resultado );

    }
}
