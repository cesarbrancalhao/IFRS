package j3.l1;

import java.util.Scanner;

public class exercicio2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char tipoAcao;
        double precoCompra, precoVenda;
        int quantidadeLucroSuperior1000 = 0;
        int quantidadeLucroInferior200 = 0;

        do {
            System.out.print("Digite o tipo de ação ('F' para finalizar): ");
            tipoAcao = scanner.nextLine().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra da ação: ");
            precoCompra = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o preço de venda da ação: ");
            precoVenda = Double.parseDouble(scanner.nextLine());

            double lucro = precoVenda - precoCompra;

            if (lucro > 1000) {
                quantidadeLucroSuperior1000++;
            } else if (lucro < 200) {
                quantidadeLucroInferior200++;
            }

        } while (true);

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + quantidadeLucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + quantidadeLucroInferior200);
    }
}
