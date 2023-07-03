package j2;

import java.util.Scanner;

public class medianotas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nro_estudantes, soma, nota, notaslidas;
        double media;

        System.out.print("Numero de estudantes da turma: ");
        nro_estudantes = scanner.nextInt();
        soma = 0;

        for(notaslidas = 0; notaslidas < nro_estudantes; notaslidas = notaslidas + 1){
            System.out.printf("Nota %d: ", notaslidas+1);
            nota = scanner.nextInt();
            soma = soma + nota;
        }

        media = (double) soma / nro_estudantes;
        System.out.printf("Media das notas = %.1f\n", media);
    }
}
