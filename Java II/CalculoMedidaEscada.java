package j2;

import java.util.Scanner;

public class CalculoMedidaEscada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altParede, angulo, angRadianos, medidaEscada;



        System.out.print("Altura da Parede: ");

        altParede = scanner.nextDouble();



        System.out.print("Ângulo entre a escada e o chão: ");

        angulo = scanner.nextDouble();



        angRadianos = Math.toRadians(angulo);

        medidaEscada = altParede / Math.sin(angRadianos);



        System.out.printf("Medida da Escada = %.1f m\n", medidaEscada);

        scanner.close();
    }
}
