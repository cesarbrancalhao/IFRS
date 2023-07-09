package j3.l3;

public class exercicio2_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Preenche a matriz com valores aleatórios entre 1 e 100
        preencherMatriz(matriz);

        // Mostra a matriz
        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        // Calcula a média dos elementos da diagonal principal
        double mediaDiagonal = calcularMediaDiagonal(matriz);

        // Mostra a média dos elementos da diagonal principal
        System.out.println("Média dos elementos da diagonal principal: " + mediaDiagonal);
    }

    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static double calcularMediaDiagonal(int[][] matriz) {
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
            contador++;
        }

        double media = (double) soma / contador;
        return media;
    }
}

