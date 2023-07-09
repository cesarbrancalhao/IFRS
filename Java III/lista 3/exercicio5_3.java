package j3.l3;

import java.util.Scanner;

public class exercicio5_3 {
    public static void main(String[] args) {
        String[] nomesAlunos = new String[15];
        double[][] notasAlunos = new double[15][5];

        // Leitura dos nomes dos alunos
        lerNomesAlunos(nomesAlunos);

        // Leitura das notas dos alunos
        lerNotasAlunos(notasAlunos);

        // Cálculo da média e situação dos alunos
        double[] mediasAlunos = calcularMediasAlunos(notasAlunos);
        String[] situacoesAlunos = calcularSituacoesAlunos(mediasAlunos);

        // Mostrar os dados dos alunos
        mostrarDadosAlunos(nomesAlunos, mediasAlunos, situacoesAlunos);
    }

    public static void lerNomesAlunos(String[] nomesAlunos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os nomes dos alunos:");

        for (int i = 0; i < nomesAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            nomesAlunos[i] = scanner.nextLine();
        }

        System.out.println();
    }

    public static void lerNotasAlunos(double[][] notasAlunos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as notas dos alunos:");

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print("Prova " + (j + 1) + ": ");
                notasAlunos[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
    }

    public static double[] calcularMediasAlunos(double[][] notasAlunos) {
        double[] medias = new double[notasAlunos.length];

        for (int i = 0; i < notasAlunos.length; i++) {
            double soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            medias[i] = soma / notasAlunos[i].length;
        }

        return medias;
    }

    public static String[] calcularSituacoesAlunos(double[] mediasAlunos) {
        String[] situacoes = new String[mediasAlunos.length];

        for (int i = 0; i < mediasAlunos.length; i++) {
            if (mediasAlunos[i] >= 7) {
                situacoes[i] = "Aprovado";
            } else if (mediasAlunos[i] < 2) {
                situacoes[i] = "Reprovado";
            } else {
                situacoes[i] = "Exame";
            }
        }

        return situacoes;
    }

    public static void mostrarDadosAlunos(String[] nomesAlunos, double[] mediasAlunos, String[] situacoesAlunos) {
        System.out.println("Dados dos alunos:");

        for (int i = 0; i < nomesAlunos.length; i++) {
            System.out.println("Aluno: " + nomesAlunos[i]);
            System.out.println("Média: " + mediasAlunos[i]);
            System.out.println("Situação: " + situacoesAlunos[i]);
            System.out.println();
        }
    }
}

