package j2;

import java.util.Scanner;

public class CalculosComNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero, quad, cub, raiz_quad, raiz_cub;

        System.out.print("Número: ");

        numero = scanner.nextDouble();



        quad = Math.pow(numero, 2);

        cub = Math.pow(numero, 3);

        raiz_quad = Math.sqrt(numero);

        raiz_cub = Math.cbrt(numero);



        System.out.printf("Número ao quadrado = %.1f\n", quad);

        System.out.printf("Número ao cubo = %.1f\n", cub);

        System.out.printf("Raiz quadrada do número = %.1f\n", raiz_quad);

        System.out.printf("Raiz cúbica do número = %.1f\n", raiz_cub);

        scanner.close();
    }
}
