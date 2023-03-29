import java.util.Scanner;

public class LeitorNumeros {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Quantos anos voce tem: ");
        int idade = 0;
        idade = keyboardInput.nextInt();
        keyboardInput.nextLine();

        System.out.println("Qual e o seu sexo: ");
        String sexo = keyboardInput.nextLine();

        System.out.println("Qual e a sua altura: ");
        double altura = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.println("Idade lida:" + idade);
        System.out.println("Altura lida:" + altura);
        System.out.println("Sexo lido:" + sexo);
        System.out.println(idade + sexo + altura);

    }
}