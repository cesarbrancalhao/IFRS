package j3;

public class CalculaRaizQuadrada {

    // A definição do método positivoOuNegativo deve ser colocada aqui.

    public static void main(String[] args) {

        double numero;

        System.out.print("Numero: ");

        numero = Double.parseDouble(System.console().readLine());


        if (positivoOuNegativo(numero) == 1)

            System.out.printf("Raiz quadrada = %f\n", Math.sqrt(numero));

        else

            System.out.println("Não é possível calcular a raiz quadrada.");

    }

    static int positivoOuNegativo(double num) {

        if (num < 0)

            return 0;

        else

            return -1;

    }
}
