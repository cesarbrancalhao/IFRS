import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];

        System.out.println("Insira o primeiro número.");
        a[0] = scanner.nextInt();
        System.out.println("Insira o segundo número.");
        a[1] = scanner.nextInt();
        System.out.println("Insira o terceiro número.");
        a[2] = scanner.nextInt();

        int maior = a[0];

        for (int i = 0; i < a.length; i++) {
            if (maior < a[i]) {
                maior = a[i];
            }
        }

        System.out.println("O maior número é " + maior + ".");
        scanner.close();
    }
}
