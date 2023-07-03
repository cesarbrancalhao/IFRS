package j2;

import java.util.Scanner;

public class fatorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, valor, fatorial;

        System.out.print("Número: ");
        numero = scanner.nextInt();

        fatorial = 1;
        for(valor = 2; valor <= numero; valor = valor + 1)
            fatorial = fatorial * valor;

        System.out.printf("Fatorial = %d\n", fatorial);
    }
}
