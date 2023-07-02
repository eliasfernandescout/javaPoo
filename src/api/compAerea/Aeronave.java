package api.compAerea;

public class Aeronave {
    String nome;
    int totalAssentos;
    int assentosReservados;
    boolean ativo = true;

    public int calcularAssentosDiposniveis() {
        if (ativo == true) {
            return totalAssentos - assentosReservados;
        } else {
            System.out.println("Aeronave desativada, impossivel calcular assentos disponiveis;");
            return 0;
        }

    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
