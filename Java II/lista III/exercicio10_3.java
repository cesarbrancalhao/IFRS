package j2.l3;

import java.util.Scanner;

public class exercicio10_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira 2 numeros inteiros.");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Deseja:");
        System.out.println("1. Somar os dois números.");
        System.out.println("2. Calcular o quadrado dos números.");
        System.out.print("Insira o número da operação: ");

        int pergunta = scanner.nextInt();

        switch (pergunta) {
            case 1:
                System.out.println("Soma: " + (n1+n2) + "."); break;
            case 2:
                System.out.println("Quadrados: " + (n1*n1) + ", " + (n2+n2) + "."); break;
            default:
                break;
        }
        scanner.close();
    }
}
