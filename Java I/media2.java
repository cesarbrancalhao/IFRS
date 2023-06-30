import java.util.Scanner;

public class media2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num1, num2, num3, num4;

        System.out.print("Insira a primeira nota: ");
        num1 = scanner.nextFloat();

        System.out.print("Insira a segunda nota: ");
        num2 = scanner.nextFloat();

        System.out.print("Insira a terceira nota: ");
        num3 = scanner.nextFloat();

        System.out.print("Insira a quarta nota: ");
        num4 = scanner.nextFloat();

        float media = (num1 + num2 + num3 + num4) / 4);

        System.out.printf("Média final = %.1f.\n", media);

        char conceito = ' ';
        String situacao = " ";
        if (media >= 9){
            conceito = 'A';
            situacao = "aprovado";
        } else if (media < 9 && media >= 8){
            conceito = 'B';
            situacao = "aprovado";
        } else if (media < 8 && media >= 7){
            conceito = 'C';
            situacao = "aprovado";
        } else if (media < 7){
            conceito = 'D';
            situacao = "reprovado";
        }

        System.out.println("Conceito final = " + conceito + ".");
        System.out.println("Situação = " + situacao + ".");
    }
}
