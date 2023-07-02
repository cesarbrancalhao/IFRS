import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Insira um valor inteiro.");
        num = scanner.nextInt();

        if (num >= 1 && num <= 9){
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
        scanner.close();
    }
}
