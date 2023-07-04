package j2.l3;

import java.util.Scanner;

public class exercicio8_3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Insira a senha (numérica): ");
            senha = scanner.nextInt();
        } while (senha != 1234);

        System.out.println("Acesso liberado.");

        scanner.close();
    }
}
