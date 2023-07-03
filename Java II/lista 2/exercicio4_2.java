package j2.l2;

import java.util.Scanner;

public class exercicio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, i = 0, soma = 0;
        double media;
        System.out.println("Calculadora de média de idades. Para sair, digite 0.");

        do{
            System.out.print("Insira sua idade: ");
            idade = scanner.nextInt();
            soma = soma + idade;
            i++;
        } while (idade != 0);
        media = (double) soma / i;
        System.out.printf("Média de idade: %.0f.\n", media);
    }
}