package j3.l4;

import java.util.Scanner;

public class exercicio5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira fração:");
        System.out.print("Numerador 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Denominador 1: ");
        int d1 = scanner.nextInt();

        System.out.println("Informe a segunda fração:");
        System.out.print("Numerador 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Denominador 2: ");
        int d2 = scanner.nextInt();

        int mmc = calcularMMC(d1, d2);
        int dr = mmc;
        int nr = (mmc / d1) * n1 + (mmc / d2) * n2;

        System.out.println("O resultado da soma das frações é: " + nr + "/" + dr);

        scanner.close();
    }

    public static int calcularMMC(int a, int b) {
        int mmc = (a * b) / calcularMDC(a, b);
        return mmc;
    }

    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }
}
