import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Insira o primeiro número.");
        a = scanner.nextDouble();
        System.out.println("Insira o segundo número.");
        b = scanner.nextDouble();
        System.out.println("Insira o terceiro número.");
        c = scanner.nextDouble();

        delta = b*b-4*a*c;

        if (delta < 0){
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais.");
        } else if (delta == 0) {
            System.out.println("A equação possui uma única raiz real.");
        }
        scanner.close();
    }
}