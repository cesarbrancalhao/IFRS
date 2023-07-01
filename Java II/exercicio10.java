import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota[] = new float[3], media;

        System.out.println("Insira a nota do laboratório.");
        nota[0] = scanner.nextFloat();
        System.out.println("Insira a nota de avaliação semestral.");
        nota[1] = scanner.nextFloat();
        System.out.println("Insira a nota de exame final.");
        nota[2] = scanner.nextFloat();

        media = (nota[0] * 2 + nota[1] * 3 + nota[2] * 5)/(2+3+5);
        System.out.printf("A nota final é: %.1f.\n", media);

        if (media < 5){
            System.out.println("Conceito: E.");
        } else if (media >= 5 && media < 6) {
            System.out.println("Conceito: D.");
        } else if (media >= 6 && media < 7) {
            System.out.println("Conceito: C.");
        } else if (media >= 7 && media < 8) {
            System.out.println("Conceito: B.");
        } else if (media >= 8) {
            System.out.println("Conceito: A.");
        }
        scanner.close();
    }
}