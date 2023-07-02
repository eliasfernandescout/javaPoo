package api.compAerea;

public class Aeronave {
    String nome;
    int totalAssentos;
    int assentosReservados;
    boolean ativo = true;

    public int calcularAssentosDiposniveis() {
        return totalAssentos = assentosReservados;
    }

    void reservarAssentos(int numerosAssentos) {
        if (ativo == true) {
            assentosReservados += numerosAssentos;
        } else {
            System.out.println("Aeronave desativada, assentos nao reservados;");

        }

    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
