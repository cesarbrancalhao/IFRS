package j3.l4;

public class exercicio1_4 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 100; i >= 80; i--) {
            double termo = i / fatorial(i - 80);
            soma += termo;
        }

        System.out.println("A soma dos termos da série é: " + soma);
    }

    public static int fatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
