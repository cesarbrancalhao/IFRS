package j3.l2;

import java.util.Scanner;

public class exercicio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] resultados = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            resultados[i] = vetorA[i] - vetorB[4 - i];
        }

        System.out.println("\nResultados das subtrações:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
        }
    }
}
