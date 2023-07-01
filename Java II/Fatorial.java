package j2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, valor, fatorial;

        System.out.println("Insira o número.");
        numero = scanner.nextInt();

        valor = 2;
        fatorial = 1;

        while (valor <= numero){
            fatorial = fatorial * valor;
            valor = valor + 1;
        }
        scanner.close();
        System.out.println("Fatorial: " + fatorial);
    }
}
