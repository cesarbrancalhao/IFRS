import java.util.Scanner;

public class VerificaSitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double N1, N2, N3, result;

        System.out.print("Insira a nota 1: ");
        N1 = scanner.nextDouble();

        System.out.print("Insira a nota 2: ");
        N2 = scanner.nextDouble();

        System.out.print("Insira a nota 3: ");
        N3 = scanner.nextDouble();

        System.out.println(" ");
        result = (N1 + N2 + N3) / 3;

        if (result < 3){
            System.out.println("Reprovado.");
        } else if (result > 3 && result < 7){
            System.out.println("Exame.");
        } else if (result > 7){
            System.out.println("Aprovado.");
        }
        scanner.close();
    }
}
