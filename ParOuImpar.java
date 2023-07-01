import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é par.");
        } else if (num % 2 == 1) {
            System.out.println("O número é ímpar.");
        } else {System.out.println("Erro");}
    }
}
