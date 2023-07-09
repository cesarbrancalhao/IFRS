package j3.l3;

public class exercicio1_3 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][4];

        // Preenche a matriz com valores aleatórios entre 1 e 100
        preencherMatriz(matriz);

        // Mostra a matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcula o maior elemento de cada linha e multiplica a linha pelo maior elemento
        calcularEMultiplicar(matriz);

        // Mostra a matriz resultante
        System.out.println("Matriz resultante:");
        mostrarMatriz(matriz);
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

    public static void calcularEMultiplicar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int maiorElemento = matriz[i][0];

            // Encontra o maior elemento da linha
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }

            // Multiplica a linha pelo maior elemento
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= maiorElemento;
            }
        }
    }
}
