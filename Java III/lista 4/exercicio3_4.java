package j3.l4;

public class exercicio3_4 {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimo(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
