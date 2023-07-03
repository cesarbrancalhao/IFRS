package j2.l2;

import java.util.Scanner;

public class exercicio5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double quantLitros, quantLitrosTotal = 0, distancia, distanciaTotal = 0, media;

        System.out.println("Calculador de consumo, para sair, digite 0.");
        do {
            int i = 1;
            System.out.println("Insira a quantidade de combustível da viagem " + i);
            quantLitros = scanner.nextDouble();
            quantLitrosTotal = quantLitrosTotal + quantLitros;
            System.out.println("Insira a distância da viagem " + i);
            distancia = scanner.nextDouble();
            distanciaTotal = distanciaTotal + distancia;
            i++;
        } while (quantLitros > 0);

        media = quantLitrosTotal / distanciaTotal;
        System.out.printf("Média de consumo: %.1f L/km.", media);
        scanner.close();
    }
}