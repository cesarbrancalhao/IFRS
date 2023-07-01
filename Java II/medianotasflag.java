package j2;

import java.util.Scanner;

public class medianotasflag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readnotas = 1;
        double media, nota, soma = 0;

        System.out.println("Para parar, digite um número negativo.");
        System.out.println("Nota 1:");
        nota = scanner.nextDouble();
        soma = soma + nota;

        while (nota > -1) {
            System.out.println("Nota " + (readnotas + 1) + ":");
            nota = scanner.nextDouble();
            soma = soma + nota;
            readnotas++;
        }
        scanner.close();

        media = soma / readnotas;
        System.out.printf("Média da turma: %.1f.\n", media);
    }
}