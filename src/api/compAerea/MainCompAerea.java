package api.compAerea;

public class MainCompAerea {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();

        aviaoGol.nome = "Airbus 780";
        aviaoGol.totalAssentos = 200;
        aviaoGol.assentosReservados = 87;
        aviaoGol.desativar();
        aviaoGol.ativar();

        System.out.printf("GOL (%S): %d assentos disponiveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDiposniveis());




    }
}
