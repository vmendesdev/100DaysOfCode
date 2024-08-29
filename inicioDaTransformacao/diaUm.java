import java.util.Scanner;


public class diaUm {

    public static void main (String[] args) {
        int num1, num2;
        int somaSimples;

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println ("Digite o primeiro número: ");
        num2 = scanner.nextInt();

        somaSimples = num1 + num2;

        System.out.println("O resultado da soma "+num1+" + "+num2+" é: " +somaSimples);

    }
}