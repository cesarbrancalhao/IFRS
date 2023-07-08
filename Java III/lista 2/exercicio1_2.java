package j3.l2;

import java.text.DecimalFormat;

public class exercicio1_2 {
    public static void main(String[] args) {
        String[] produtos = new String[10];
        int[] codigos = new int[10];
        double[] precos = new double[10];

        // Preenchendo os vetores com os dados dos produtos
        produtos[0] = "Produto A";
        produtos[1] = "Produto B";
        produtos[2] = "Produto C";
        produtos[3] = "Produto D";
        produtos[4] = "Produto E";
        produtos[5] = "Produto F";
        produtos[6] = "Produto G";
        produtos[7] = "Produto H";
        produtos[8] = "Produto I";
        produtos[9] = "Produto J";

        codigos[0] = 1;
        codigos[1] = 2;
        codigos[2] = 3;
        codigos[3] = 4;
        codigos[4] = 5;
        codigos[5] = 6;
        codigos[6] = 7;
        codigos[7] = 8;
        codigos[8] = 9;
        codigos[9] = 10;

        precos[0] = 500.0;
        precos[1] = 1500.0;
        precos[2] = 800.0;
        precos[3] = 1200.0;
        precos[4] = 900.0;
        precos[5] = 1100.0;
        precos[6] = 2000.0;
        precos[7] = 700.0;
        precos[8] = 300.0;
        precos[9] = 10000.0;

        // Exibindo o relatório com os produtos que sofrerão aumento
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        System.out.println("Relatório de Aumento de Produtos:\n");
        System.out.println("Nome\t\tCódigo\tPreço\tNovo Preço\n");

        for (int i = 0; i < 10; i++) {
            boolean codigoPar = codigos[i] % 2 == 0;
            boolean precoMaiorQueMil = precos[i] > 1000.0;

            if (codigoPar && precoMaiorQueMil) {
                double novoPreco = precos[i] * 1.2;
                System.out.println(produtos[i] + "\t" + codigos[i] + "\t" +
                        decimalFormat.format(precos[i]) + "\t" +
                        decimalFormat.format(novoPreco));
            } else if (codigoPar) {
                double novoPreco = precos[i] * 1.15;
                System.out.println(produtos[i] + "\t" + codigos[i] + "\t" +
                        decimalFormat.format(precos[i]) + "\t" +
                        decimalFormat.format(novoPreco));
            } else if (precoMaiorQueMil) {
                double novoPreco = precos[i] * 1.1;
                System.out.println(produtos[i] + "\t" + codigos[i] + "\t" +
                        decimalFormat.format(precos[i]) + "\t" +
                        decimalFormat.format(novoPreco));
            }
        }
    }
}
