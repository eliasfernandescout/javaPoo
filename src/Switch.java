import java.util.Scanner;

public class Switch {

    public static void main(String[] args){
        System.out.println("1 - Cafe expresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Machiato");
        System.out.println("Escolha uma opcao acima!");

        Scanner keyboardInput = new Scanner(System.in);
        int opcao = keyboardInput.nextInt();
        int preco = 0;

        switch (opcao){
            case 1:
                System.out.println("Expresso escolhido, R$ 2,00");
                preco = 2;
                break;
            case 2:
                System.out.println("Cappuccino escolhido, R$ 6,00");
                preco = 6;
                break;
            case 3:
                System.out.println("Machiato escolhido, R$ 4,00");
                preco = 4;
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        System.out.println("Total a pagar R$"+preco);



    }
}
