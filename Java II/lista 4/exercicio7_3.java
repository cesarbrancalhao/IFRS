package j2.l4;

import java.util.Scanner;

public class exercicio7_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Menu:");
        System.out.println("1. Elevar o primeiro ao segundo.");
        System.out.println("2. Raiz de cada um.");
        System.out.println("3. Raiz cúbica de cada um.");
        System.out.println("Digite o número da sua escolha:");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                double pot = Math.pow(num1, num2);
                System.out.println("Resultado: " + pot); break;

            case 2:
                double raiz1 = Math.sqrt(num1);
                double raiz2 = Math.sqrt(num2);
                System.out.println("Raiz 1: " + raiz1 + "\nRaiz 2:" + raiz2); break;

            case 3:
                double raiz11 = Math.cbrt(num1);
                double raiz22 = Math.cbrt(num2); break;

            default:
                System.out.println("Opção inválida, o programa será encerrado.");
        }
        scanner.close();
    }
}
