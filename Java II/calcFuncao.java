package j2;

import java.util.Scanner;

public class calcFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, fx;

        System.out.println("Para encerrar digite 0.");
        System.out.println("\nF(x) = x² - 5x + 6.");
        System.out.print("Insira X: ");
        x = scanner.nextDouble();

        while (x != 0){
            fx = x*x - 5*x + 6;
            System.out.println("F(x): " + fx);
            System.out.print("Insira X: ");
            x = scanner.nextDouble();
        }

        scanner.close();
    }
}
