package j3.l2;

import java.util.Scanner;

public class exercicio2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("\nOs números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);
            if (i < 4) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(soma);
    }
}
