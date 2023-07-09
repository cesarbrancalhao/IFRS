package j3.l3;

import java.util.Scanner;

public class exercicio4_3 {
    public static void main(String[] args) {
        char[][] respostasCandidatos = new char[10][10];
        char[] gabarito = new char[10];
        int[] pontosCandidatos = new int[10];

        // Leitura das respostas dos candidatos
        lerRespostasCandidatos(respostasCandidatos);

        // Leitura do gabarito
        lerGabarito(gabarito);

        // Cálculo dos pontos obtidos por cada candidato
        calcularPontosCandidatos(respostasCandidatos, gabarito, pontosCandidatos);

        // Mostrar o total de pontos obtidos por cada candidato
        mostrarPontosCandidatos(pontosCandidatos);
    }

    public static void lerRespostasCandidatos(char[][] respostasCandidatos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as respostas dos candidatos:");

        for (int i = 0; i < respostasCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ":");
            for (int j = 0; j < respostasCandidatos[i].length; j++) {
                System.out.print("Resposta " + (j + 1) + ": ");
                respostasCandidatos[i][j] = scanner.nextLine().charAt(0);
            }
            System.out.println();
        }
    }

    public static void lerGabarito(char[] gabarito) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o gabarito:");

        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            gabarito[i] = scanner.nextLine().charAt(0);
        }

        System.out.println();
    }

    public static void calcularPontosCandidatos(char[][] respostasCandidatos, char[] gabarito, int[] pontosCandidatos) {
        for (int i = 0; i < respostasCandidatos.length; i++) {
            int pontos = 0;

            for (int j = 0; j < respostasCandidatos[i].length; j++) {
                if (respostasCandidatos[i][j] == gabarito[j]) {
                    pontos++;
                }
            }

            pontosCandidatos[i] = pontos;
        }
    }

    public static void mostrarPontosCandidatos(int[] pontosCandidatos) {
        System.out.println("Total de pontos obtidos por cada candidato:");

        for (int i = 0; i < pontosCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + pontosCandidatos[i] + " pontos");
        }
    }
}
