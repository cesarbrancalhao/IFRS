package j2.l2;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco, quantTotal, quantMensal = 0;
        ArrayList<String> nome = new ArrayList<>();
        String continuar;

        System.out.print("Nome do produto: ");
        nome.add(scanner.nextLine());

        System.out.print("Preço unitário: ");
        preco = scanner.nextDouble();

        System.out.print("Quantidade vendida: ");
        quantTotal = scanner.nextDouble();
        quantMensal = quantMensal + (preco * quantTotal);

        scanner.nextLine(); //consume

        System.out.println("Inserir novo item? [S/N]");
        continuar = scanner.nextLine().substring(0, 1);

        while (continuar.equalsIgnoreCase("s")){
        int i = 1;
            System.out.print("Nome do produto: ");
            nome.add(scanner.nextLine());

            System.out.print("Preço unitário: ");
            preco = scanner.nextDouble();

            System.out.print("Quantidade vendida: ");
            quantTotal = scanner.nextDouble();
            quantMensal = quantMensal + (preco * quantTotal);
            scanner.nextLine();

            System.out.println("Inserir novo item? [S/N]");
            continuar = scanner.nextLine().substring(0, 1);
        }
        scanner.close();
        System.out.printf("Faturamento mensal: R$%.2f.\n", quantMensal);
    }
}