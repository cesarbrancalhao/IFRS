package j2;

import java.util.Scanner;

public class exercicio2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número:");
        int n = scanner.nextInt(), soma = 0, somaquad = 0;
        double media;

        for (int i = 0; i < n; i++){
            soma = soma + i;
            somaquad = somaquad + i*i;
        }
        System.out.println("Soma dos quadrados: "+ somaquad);
        media = (double) soma / n;
        System.out.printf("Média: %.1f", media);
    }
}
