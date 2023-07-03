package j2;

import java.util.Scanner;

public class RepeteLeitura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();
        } while(numero != 8);

        System.out.println("Você acertou o número!");
    }
}
