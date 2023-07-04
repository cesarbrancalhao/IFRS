package j2.l3;

import java.util.Scanner;

public class exercicio1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, ano;
        String mesNome = null;

        System.out.println("Insira o dia.");
        dia = scanner.nextInt();

        while (dia > 31 || dia < 1){
            System.out.println("Dia inválido, insira o dia.");
            dia = scanner.nextInt();
        }

        System.out.println("Insira o mês.");
        mes = scanner.nextInt();

        while (mes > 12 || mes < 1){
            System.out.println("Mês inválido, insira o mês");
            mes = scanner.nextInt();
        }

        switch (mes){
            case 1:
                mesNome = "Janeiro"; break;
            case 2:
                mesNome = "Fevereiro"; break;
            case 3:
                mesNome = "Março"; break;
            case 4:
                mesNome = "Abril"; break;
            case 5:
                mesNome = "Maio"; break;
            case 6:
                mesNome = "Junho"; break;
            case 7:
                mesNome = "Julho"; break;
            case 8:
                mesNome = "Agosto"; break;
            case 9:
                mesNome = "Setembro"; break;
            case 10:
                mesNome = "Outubro"; break;
            case 11:
                mesNome = "Novembro"; break;
            case 12:
                mesNome = "Dezembro"; break;
        }

        System.out.println("Insira o ano.");
        ano = scanner.nextInt();

        System.out.printf("Data: %d de %s de %d.\n", dia, mesNome, ano);
      scanner.close();
    }
}
