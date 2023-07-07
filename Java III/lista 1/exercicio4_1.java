package j3.l1;

import java.util.Scanner;

public class exercicio4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionarios = 58;
        double valorPlanoSaude = 0.045; // 4.5% do salário

        double[] salarios = new double[numeroFuncionarios];
        double totalFolhaPagamento = 0;
        double totalImpostoRenda = 0;

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = Double.parseDouble(scanner.nextLine());

            double descontoINSS = calcularDescontoINSS(salarios[i]);
            double descontoImpostoRenda = calcularDescontoImpostoRenda(salarios[i]);

            double salarioLiquido = salarios[i] - (salarios[i] * valorPlanoSaude) - descontoINSS - descontoImpostoRenda;

            totalFolhaPagamento += salarios[i];
            totalImpostoRenda += descontoImpostoRenda;

            System.out.println("Salário líquido do funcionário " + (i + 1) + ": " + salarioLiquido);
        }

        System.out.println("Valor total da folha de pagamento: " + totalFolhaPagamento);
        System.out.println("Valor total do imposto de renda a ser recolhido: " + totalImpostoRenda);
    }

    public static double calcularDescontoINSS(double salario) {
        if (salario <= 1693) {
            return salario * 0.08;
        } else if (salario <= 2822) {
            return salario * 0.09;
        } else {
            return salario * 0.11;
        }
    }

    public static double calcularDescontoImpostoRenda(double salario) {
        if (salario <= 1903) {
            return 0;
        } else if (salario <= 2826) {
            return salario * 0.075;
        } else if (salario <= 3751) {
            return salario * 0.15;
        } else if (salario <= 4664) {
            return salario * 0.225;
        } else {
            return salario * 0.275;
        }
    }
}
