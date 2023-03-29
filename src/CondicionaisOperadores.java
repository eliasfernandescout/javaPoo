import java.util.Scanner;

public class CondicionaisOperadores {

    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");
        int idade = keyboardInput.nextInt();


        if(idade == 18){
            System.out.println("Precisa se alistar");
        }else if(idade > 18){
            System.out.println("Se alistou");
        }else{
            System.out.println("Menor de idade");
        }

    }
}
