package j2.l4;

import java.util.Scanner;

public class exercicio4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira A: ");
        double a = scanner.nextDouble();

        System.out.print("Insira B: ");
        double b = scanner.nextDouble();

        System.out.print("Insira C: ");
        double c = scanner.nextDouble();

        double disc = (b * b) - (4 * a * c);

        if (disc > 0){
            double raiz1 = (-b + Math.sqrt(disc)/2*a);
            double raiz2 = (-b - Math.sqrt(disc)/2*a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2:" + raiz2);
        } else if (disc == 0) {
            double raiz = -b / (2*a);
            System.out.println("Raiz: " + raiz);
        } else {
            System.out.println("Não há raizes reais.");
        }
        scanner.close();
    }
}
