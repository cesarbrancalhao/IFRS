package j3.l1;

import java.util.Scanner;
public class exercicio6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            exibirMenu();

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 3.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu de opções:");
        System.out.println("1. Média Aritmética");
        System.out.println("2. Média Ponderada");
        System.out.println("3. Sair");
    }

    public static void calcularMediaAritmetica(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média Aritmética: " + media);
    }

    public static void calcularMediaPonderada(Scanner scanner) {
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("Média Ponderada: " + media);
    }
}
