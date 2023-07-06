package j2.l4;

import java.util.Scanner;

public class exercicio3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número em binário.");
        int bin = Integer.parseInt((scanner.nextLine()), 2);
        System.out.println("Decimal: " +  bin);
    }
}
