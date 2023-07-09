package j3;

import java.util.Arrays;

public class jogodaforca {
    public static void main(String[] args) {
        char[] palavra = sorteiaPalavra();
        char[] tabuleiro = montaTabuleiro(palavra);
        int erros = 0;

        while (erros <= 7 && !Arrays.equals(tabuleiro, palavra)) {
            mostraTabuleiro(tabuleiro);

            System.out.print("Informe uma letra: ");
            char letra = System.console().readLine().charAt(0);

            if (acertou(palavra, letra))
                atualizaTabuleiro(tabuleiro, palavra, letra);
            else
                erros++;
        }

        if (erros > 7)
            System.out.println("Você perdeu :(");
        else
            System.out.println("Você venceu :)");
    }

    private static char[] sorteiaPalavra() {

        int sorteio = (int)(Math.random()*10)+1;



        switch (sorteio) {
            case 1:
                return new char[]{'U', 'V', 'A'};
            case 2:
                return new char[]{'B', 'A', 'N', 'A', 'N', 'A'};
            case 3:
                return new char[]{'A', 'B', 'A', 'C', 'A', 'X', 'I'};
            case 4:
                return new char[]{'M', 'A', 'N', 'G', 'A'};
            case 5:
                return new char[]{'M', 'A', 'R', 'A', 'C', 'U', 'J', 'A'};
            case 6:
                return new char[]{'L', 'A', 'R', 'A', 'N', 'J', 'A'};
            case 7:
                return new char[]{'M', 'O', 'R', 'A', 'N', 'G', 'O'};
            case 8:
                return new char[]{'L', 'I', 'M', 'A', 'O'};
            case 9:
                return new char[]{'A', 'C', 'E', 'R', 'O', 'L', 'A'};
            case 10:
                return new char[]{'C', 'A', 'Q', 'U', 'I'};
            default:
                throw new IllegalArgumentException("Número de sorteio inválido.");
        }
    }

    static char[] montaTabuleiro(char[] palavra) {

        char[] tabuleiro = new char[palavra.length];

        for(int cont = 0; cont < tabuleiro.length; cont++) {

            tabuleiro[cont] = '_';

        }

        return tabuleiro;

    }

    static void mostraTabuleiro(char[] tabuleiro) {

        for(int cont = 0; cont < tabuleiro.length; cont++) {

            System.out.print(tabuleiro[cont]);

            System.out.print(" ");

        }

        System.out.println();

    }

    static boolean acertou(char[] palavra, char letra) {

        for(int cont = 0; cont < palavra.length; cont++) {

            if(palavra[cont] == letra)

                return true;

        }

        return false;

    }

    static void atualizaTabuleiro(char[] tabuleiro, char[] palavra, char letra) {

        for(int cont = 0; cont < palavra.length; cont++) {

            if(palavra[cont] == letra)

                tabuleiro[cont] = letra;

        }

    }
}