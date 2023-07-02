import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];

        System.out.println("Insira o primeiro número.");
        a[0] = scanner.nextInt();
        System.out.println("Insira o segundo número.");
        a[1] = scanner.nextInt();
        System.out.println("Insira o terceiro número.");
        a[2] = scanner.nextInt();

        int menor = a[0];

        for (int i = 0; i < a.length; i++) {
            if (menor > a[i]) {
                menor = a[i];
            }
        }

        System.out.println("O menor número é " + menor + ".");
        scanner.close();
    }
}
