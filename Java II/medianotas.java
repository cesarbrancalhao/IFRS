package j2;

import java.util.Scanner;

public class medianotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_estudantes, readnotas = 0;
        double media, nota, soma = 0;

        System.out.print("Número de estudantes da turma: ");
        num_estudantes = scanner.nextInt();

        while (readnotas < num_estudantes) {
            System.out.println("Nota " + (readnotas + 1) + ".");
            nota = scanner.nextDouble();
            soma = soma + nota;
            readnotas++;
        }
        scanner.close();
        
        media = soma / num_estudantes;
        System.out.printf("Média da turma: %.1f.\n", media);
    }
}