import java.util.Scanner;

public class ConectivosLogicos {

    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");
        int pessoa1 = keyboardInput.nextInt();
        System.out.println("Insira a sua idade: ");
        int pessoa2 = keyboardInput.nextInt();

        if(pessoa1 > 17 && pessoa2 > 17){
            System.out.println("PODEM ENTRAR NA FESTA");
        }else if(pessoa1 <18  || pessoa2 <18){
            System.out.println("NAO PODEM ENTRAR");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
