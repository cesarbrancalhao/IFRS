package j3;

import java.util.Scanner;

public class LojaArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] ValorUnit = new double[10];
        int[] QuantVend = new int[10];
        int objMaisVend = 0;

        double total, totalGeral = 0, comissao;

        for (int i = 0; i < 10; i++) {
           System.out.printf("Insira o valor do item %d.\n", i+1);
           ValorUnit[i] = scanner.nextInt();

           System.out.printf("Insira a quantidade vendida do item %d.\n", i+1);
           QuantVend[i] = scanner.nextInt();

           total = ValorUnit[i] * QuantVend[i];
           System.out.printf("Total item %d = R$%.2f.\n", i+1, total);
           totalGeral += total;
        }

        comissao = totalGeral * 0.05;

        System.out.printf("\nTotal geral: R$%.2f.\nComissão: R$%.2f.\n", totalGeral, comissao);

        for (int i = 1; i < 10; i++) {
            if (QuantVend[i] > QuantVend[0]) {
                objMaisVend = i+1;
            }
        }

        System.out.println("Objeto mais vendido: " + objMaisVend + ".");

        scanner.close();
    }
}