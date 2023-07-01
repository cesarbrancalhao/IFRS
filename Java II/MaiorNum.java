import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número 1 e 2.");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.printf("Maior: %.1f.\n", num1);
        } else if (num1 < num2) {
            System.out.printf("Maior: %.1f.\n", num2);
        } else if (num1 == num2){
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Erro.");}
        scanner.close();
    }
}
