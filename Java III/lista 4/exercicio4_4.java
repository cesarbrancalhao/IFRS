package j3.l4;

import java.util.Scanner;

public class exercicio4_4 {
    public static void main(String[] args) {
        int[] vetorA = new int[25];

        lerVetor(vetorA);
        substituirNegativosPorZero(vetorA);
        mostrarVetor(vetorA);
    }

    public static void lerVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void substituirNegativosPorZero(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
    }

    public static void mostrarVetor(int[] vetor) {
        System.out.println("Vetor resultante:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
