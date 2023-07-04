package j2;

public class simlaDado {
    public static void main(String[] args) {
        int dado;

        for (int i = 0; i <= 5; i++) {
            dado = (int) (1 + Math.random() * 6);
            System.out.println(dado);
        }
    }
}
