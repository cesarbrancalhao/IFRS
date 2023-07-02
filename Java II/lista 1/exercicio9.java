import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;

        System.out.print("Informe seu salário: ");
        salario = scanner.nextDouble();

        if (salario < 5000 && salario > 0){
            System.out.printf("Seu salário será reajustado para R$%.2f.\n", salario*1.3);
        } else {
            System.out.println("Seu salário não será reajustado.");
        }
        scanner.close();
    }
}
