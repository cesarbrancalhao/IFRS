import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("Insira o número 1: ");
        num1 = scanner.nextInt();

        System.out.print("Insira o número 2: ");
        num2 = scanner.nextInt();

        if (num1 < num2){
            System.out.printf("Diferença: %d.\n", num2-num1);
        } else if (num1 > num2) {
            System.out.printf("Diferença: %d.\n", num1-num2);
        } else if (num1 == num2) {
            System.out.println("Diferença: 0.\n");
        }
        scanner.close();
    }
}