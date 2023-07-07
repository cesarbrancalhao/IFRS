package j3.l1;

import java.util.Scanner;

public class exercicio3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroCandidatosFeminino = 0;
        int numeroCandidatosMasculino = 0;
        int somaIdadeHomens = 0;
        int numeroHomens = 0;
        int somaIdadeMulheresComExperiencia = 0;
        int numeroMulheresComExperiencia = 0;

        char cadastrarOutroCandidato;

        do {
            System.out.print("Digite o sexo do candidato (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            System.out.print("Digite a idade do candidato: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o tempo de experiência profissional (em anos): ");
            int experiencia = Integer.parseInt(scanner.nextLine());

            if (sexo == 'F') {
                numeroCandidatosFeminino++;
                if (experiencia > 0) {
                    somaIdadeMulheresComExperiencia += idade;
                    numeroMulheresComExperiencia++;
                }
            } else if (sexo == 'M') {
                numeroCandidatosMasculino++;
                somaIdadeHomens += idade;
                numeroHomens++;
            }

            System.out.print("Deseja cadastrar outro candidato? (S/N): ");
            cadastrarOutroCandidato = scanner.nextLine().charAt(0);
        } while (cadastrarOutroCandidato == 'S');

        double idadeMediaHomens = (double) somaIdadeHomens / numeroHomens;
        double idadeMediaMulheresComExperiencia = (double) somaIdadeMulheresComExperiencia / numeroMulheresComExperiencia;

        System.out.println("Número de candidatos do sexo feminino: " + numeroCandidatosFeminino);
        System.out.println("Número de candidatos do sexo masculino: " + numeroCandidatosMasculino);
        System.out.println("Idade média dos homens: " + idadeMediaHomens);
        System.out.println("Idade média das mulheres com experiência: " + idadeMediaMulheresComExperiencia);
    }
}
