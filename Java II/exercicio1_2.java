package j2;

import java.util.Scanner;

public class exercicio1_2 {
    public static void main(String[] args) {
        double numero = 0, soma = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            System.out.printf("Insira o número %d: ", i+1);
            numero = scanner.nextDouble();
            soma = soma + numero;
        }
        scanner.close();

        System.out.printf("%.1f", soma);
    }
}