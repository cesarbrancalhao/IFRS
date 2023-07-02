import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;

        System.out.println("Informe o primeiro lado.");
        a = scanner.nextFloat();
        System.out.println("Informe o segundo lado.");
        b = scanner.nextFloat();
        System.out.println("Informe o terceiro lado.");
        c = scanner.nextFloat();

        if (a+b > c && a+c > b && b+c > a){
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        scanner.close();
    }
}