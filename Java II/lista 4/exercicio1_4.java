package j2.l4;

public class exercicio1_4 {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 100; i++) {
            j = i;
            System.out.print(j + " ^ 2 = ");
            System.out.printf("%.2f\n", Math.sqrt(j));
        }
    }
}
