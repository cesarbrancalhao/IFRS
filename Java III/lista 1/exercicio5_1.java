package j3.l1;

import java.util.Scanner;

public class exercicio5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int totalIdade = 0;
        int totalPeso = 0;
        int totalAltura = 0;
        int totalFeminino = 0;
        int totalMasculino = 0;
        int totalOlhosAzuisCabelosRuivos = 0;

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Informe o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Informe a cor dos olhos (1 - azuis, 2 - verdes, 3 - castanhos): ");
            int corOlhos = scanner.nextInt();

            System.out.print("Informe a cor dos cabelos (L - louros, C - castanhos, P - pretos, R - ruivos): ");
            char corCabelos = scanner.next().charAt(0);

            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe a altura: ");
            int altura = scanner.nextInt();

            System.out.print("Informe o peso: ");
            int peso = scanner.nextInt();

            totalPessoas++;
            totalIdade += idade;
            totalPeso += peso;
            totalAltura += altura;

            if (sexo == 'F' || sexo == 'f') {
                totalFeminino++;
            } else if (sexo == 'M' || sexo == 'm') {
                totalMasculino++;
            }

            if (corOlhos == 1 && corCabelos == 'R' || corCabelos == 'r') {
                totalOlhosAzuisCabelosRuivos++;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("=== Resultados ===");
        System.out.println("Média da idade: " + (totalIdade / (double) totalPessoas));
        System.out.println("Média do peso: " + (totalPeso / (double) totalPessoas));
        System.out.println("Média da altura: " + (totalAltura / (double) totalPessoas));
        System.out.println("Porcentagem de pessoas do sexo feminino: " + (totalFeminino / (double) totalPessoas * 100) + "%");
        System.out.println("Porcentagem de pessoas do sexo masculino: " + (totalMasculino / (double) totalPessoas * 100) + "%");
        System.out.println("Quantidade de pessoas com olhos azuis e cabelos ruivos: " + totalOlhosAzuisCabelosRuivos);

        scanner.close();
    }
}