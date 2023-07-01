import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[4];

        System.out.println("Insira o primeiro número.");
        a[0] = scanner.nextInt();
        System.out.println("Insira o segundo número.");
        a[1] = scanner.nextInt();
        System.out.println("Insira o terceiro número.");
        a[2] = scanner.nextInt();
        System.out.println("Insira o quarto número.");
        a[3] = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0 && a[i]%3 == 0){
                System.out.printf("O número %d é divisível por 2 e 3.\n", a[i]);
            } else if (a[i]%2 == 0 && a[i]%3 != 0){
                System.out.printf("O número %d é divisível apenas por 2.\n", a[i]);
            } else if (a[i]%2 != 0 && a[i]%3==0) {
                System.out.printf("O número %d é divisível apenas por 3.\n", a[i]);
            } else {}
        }
        scanner.close();
    }
}