package j2.l3;

import java.util.Scanner;

public class exercicio2_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua placa:");
        int placaDigitoFinal = Integer.parseInt(scanner.nextLine().substring(6,7));

        switch (placaDigitoFinal){
            case 0:
                System.out.println("Sua vistoria será em Janeiro do ano que vem."); break;
            case 1:
                System.out.println("Sua vistoria será em Fevereiro do ano que vem."); break;
            case 2:
                System.out.println("Sua vistoria será em Março do ano que vem."); break;
            case 3:
                System.out.println("Sua vistoria será em Abril do ano que vem."); break;
            case 4:
                System.out.println("Sua vistoria será em Maio do ano que vem."); break;
            case 5:
                System.out.println("Sua vistoria será em Junho do ano que vem."); break;
            case 6:
                System.out.println("Sua vistoria será em Setembro."); break;
            case 7:
                System.out.println("Sua vistoria será em Outubro."); break;
            case 8:
                System.out.println("Sua vistoria será em Novembro."); break;
            case 9:
                System.out.println("Sua vistoria será em Dezembro."); break;
        }
        scanner.close();
    }
}