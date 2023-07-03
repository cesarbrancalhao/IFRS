package j2.l2;


import java.util.Scanner;

//exibir os quadrados de números digitados
//pelo usuário, até que ele digite um número negativo.

public class exercicio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de quadrados.");
        System.out.println("Para encerrar, digite um número negativo.");
        double num;
        do {
            System.out.print("Insira o número: ");
            num = scanner.nextDouble();
            System.out.printf("Quadrado: %.1f.\n", num*num);
        } while (num >= 0);
        scanner.close();
    }
}