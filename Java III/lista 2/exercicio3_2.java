package j3.l2;

import java.util.Scanner;

public class exercicio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] clientes = new String[8];
        int[] locacoes = new int[8];
        int[] locacoesGratis = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome do cliente " + (i + 1) + ": ");
            clientes[i] = scanner.nextLine();
            System.out.print("Digite a quantidade de locações de DVDs em 2017: ");
            locacoes[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < 8; i++) {
            locacoesGratis[i] = locacoes[i] / 10;
        }

        System.out.println("\nClientes e suas locações grátis:\n");
        for (int i = 0; i < 8; i++) {
            System.out.println("Cliente: " + clientes[i]);
            System.out.println("Locações Grátis: " + locacoesGratis[i]);
            System.out.println("------------------------");
        }
    }
}