package j3;

public class EstatisticasCinema2 {

    public static void main(String[] args) {

        int idade, somaIdades = 0, maiorIdade = -1;
        int resOtimo = 0, resRuim = 0, resPessimo = 0, numPessoas = 0;
        char nota;
        double mediaIdades, percPessimo;
        int cont = 0;



        do {

            System.out.printf("--- ESPECTADOR %03d ---", cont);

            System.out.printf("Idade: ");

            idade = Integer.parseInt(System.console().readLine());

            System.out.printf("Nota: ");

            nota = System.console().readLine().charAt(0);



            if(nota != 'F') {

                numPessoas++;

                if(nota == 'A')

                resOtimo++;

else if(nota == 'D') {

                    resRuim++;

                    somaIdades += idade;

                } else if(nota == 'E') {

                    resPessimo++;

                    if(idade > maiorIdade)

                        maiorIdade = idade;

                }

            }

        } while(nota != 'F');

        mediaIdades = somaIdades / resRuim;

        percPessimo = resPessimo * 100 / numPessoas;



        System.out.printf("Notas Ótimo = %d\n", resOtimo);

        System.out.printf("Média Idades = %.1f\n", mediaIdades);

        System.out.printf("Percentual notas “Péssimo” = %d\n", percPessimo);

        System.out.printf("Maior idade a responder “Péssimo” = %d\n", maiorIdade);

    }
}
