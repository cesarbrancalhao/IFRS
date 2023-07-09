package j3.l3;

public class exercicio3_3 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];

        // Preenche a matriz com valores aleatórios
        preencherMatriz(matriz);

        // Mostra a matriz
        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        // Calcula a soma dos elementos da diagonal secundária
        double somaDiagonalSecundaria = calcularSomaDiagonalSecundaria(matriz);

        // Mostra a soma dos elementos da diagonal secundária
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
    }

    public static void preencherMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random() * 10;
            }
        }
    }

    public static void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static double calcularSomaDiagonalSecundaria(double[][] matriz) {
        double soma = 0;
        int tamanho = matriz.length;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][tamanho - 1 - i];
        }

        return soma;
    }
}