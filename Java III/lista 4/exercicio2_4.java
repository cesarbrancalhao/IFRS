package j3.l4;

import java.util.Scanner;

public class exercicio2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor de x: ");
        double x = scanner.nextDouble();
        scanner.close();

        double resultado = calcularSerieExponencial(x);

        System.out.println("O resultado da série e^x é: " + resultado);
    }

    public static double calcularSerieExponencial(double x) {
        double resultado = 1.0;
        double termo = 1.0;

        for (int i = 1; i <= 15; i++) {
            termo *= x / i;
            resultado += termo;
        }

        return resultado;
    }
}
