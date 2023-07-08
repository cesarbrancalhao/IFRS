package j3.l2;

import java.util.Scanner;

public class exercicio5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[20];
        double[] vetorResultante = new double[20];
        int maiorValor = Integer.MIN_VALUE;

        // Lendo os elementos do vetor original
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();

            // Verificando o maior valor
            if (vetorOriginal[i] > maiorValor) {
                maiorValor = vetorOriginal[i];
            }
        }

        // Realizando a divisão e armazenando os resultados no vetor resultante
        for (int i = 0; i < 20; i++) {
            vetorResultante[i] = (double) vetorOriginal[i] / maiorValor;
        }

        // Exibindo os valores armazenados no vetor resultante
        System.out.println("\nValores armazenados no vetor resultante:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetorResultante[i]);
        }
    }
}