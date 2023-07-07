package j3.l1;

import java.util.Scanner;

public class exercicio1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;
        int idade;
        double salario;

        int quantMulherSal = 0;

        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); //consume

        System.out.print("Digite o sexo [M/F]: ");
        sexo = String.valueOf(scanner.nextLine().charAt(0));

        System.out.print("Digite o salário: ");
        salario = scanner.nextDouble();

        if (salario <= 1500 && sexo.equalsIgnoreCase("f")){
            quantMulherSal++;
        }
        scanner.nextLine();

        System.out.println("Deseja inserir mais uma pessoa? [S/N].");
        String pergunta = String.valueOf(scanner.nextLine().charAt(0));

        int maxIdade = idade, minIdade = idade, contagemPessoas = 1;
        double somaSal = salario, minSal = salario, media;
        String minSalSex = sexo; int minSalIdade = idade;

        while (pergunta.equalsIgnoreCase("s")){
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if(idade > maxIdade){
                maxIdade = idade;
            } else if(idade < minIdade){
                minIdade = idade;
            }
            scanner.nextLine();

            System.out.print("Digite o sexo [M/F]: ");
            sexo = String.valueOf(scanner.nextLine().charAt(0));

            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();

            somaSal += salario;

            if (salario <= 1500 && sexo.equalsIgnoreCase("f")){
                quantMulherSal++;
            }
            if (salario < minSal){
                minSalSex = sexo;
                minSalIdade = idade;
            }
            scanner.nextLine();

            System.out.println("Deseja inserir mais uma pessoa? [S/N].");
            pergunta = String.valueOf(scanner.nextLine().charAt(0));

            contagemPessoas++;
        }

        media = somaSal / contagemPessoas;
        System.out.printf("Média salarial: R$%.2f.\n", media);

        System.out.println("Maior idade: " + maxIdade);
        System.out.println("Menor idade: " + minIdade);

        System.out.println("Quantidade de mulheres com salário de até R$1500: " + quantMulherSal);

        if (minSalSex.equalsIgnoreCase("m")){
            minSalSex = "masculino";
        } else {minSalSex = "feminino";}
        System.out.println("Idade e sexo da pessoa com o menor salário: " + minSalSex + ", " + minSalIdade + ".");

        scanner.close();
    }
}
