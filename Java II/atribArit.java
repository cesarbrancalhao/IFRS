package j2;

import java.util.Scanner;

public class atribArit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;

        for (int i = 0; i < 3; i++) {
            c += 3;
        }
        System.out.println(c);
        System.out.println(" ");

        int nro_estudantes, soma, nota, notaslidas;
        double media;

        System.out.print("Numero de estudantes da turma: ");
        nro_estudantes = scanner.nextInt();

        soma = 0;

        for(notaslidas = 0; notaslidas < nro_estudantes; notaslidas++){
            System.out.printf("Nota %d: ", notaslidas+1);
            nota = scanner.nextInt();
            soma += nota;
        }

        media = (double) soma / nro_estudantes;
        System.out.printf("Media das notas = %.1f.\n", media);
    }
}
