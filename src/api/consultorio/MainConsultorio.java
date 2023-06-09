package api.consultorio;

public class MainConsultorio {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente pacienteElias = new Paciente(134, 1.91);
//        double peso = 134;
//        double altura = 1.91;
        pacienteElias.peso = 134;
        pacienteElias.altura = 1.95;
        String nome = "Elias Fernandes";

        IndiceMassaCorporal imc = calculadoraImc.calcular(pacienteElias);
//        System.out.println((imc.estaComObesidade()? "SIM" : "NAO")); OPERADOR TERNARIO
        if(imc.estaComObesidade()){
            System.out.printf("Paciente com altura %.2f e peso de %.2f " + "esta com obesidade\n", imc.altura, imc.peso);
        }
        System.out.println("PACIENTE: "+ nome +"\nTEM O IMC DE: " + imc.resultado );

    }
}
