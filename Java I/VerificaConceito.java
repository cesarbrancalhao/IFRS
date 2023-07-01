import java.util.Scanner;

public class VerificaConceito {

    public static void main(String[] args) {
        char conceito = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.print("Conceito do aluno: ");
        conceito = scanner.next().charAt(0);

        if (conceito != 'A' && conceito != 'B' &&conceito != 'C' && conceito != 'a' && conceito != 'b' &&conceito != 'c'){
        System.out.println("Conceito inválido");
        } else if (conceito == 'A' || conceito == 'B' || conceito == 'a' || conceito == 'b') {
            System.out.println("Aluno aprovado");
        } else if (conceito == 'C' || conceito == 'c') {
            System.out.println("Aluno reprovado");
        }
        scanner.close();
    }
}