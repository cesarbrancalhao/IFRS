package j2;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um inteiro.");
        int i = scanner.nextInt();

        String parOuImpar = parOuClass(i);
        System.out.println("O número é " + parOuImpar + ".");
    }

    public static String parOuClass(int i){
        return i % 2 == 0 ? "par" : "impar";
    }
}