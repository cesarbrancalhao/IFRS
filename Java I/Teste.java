import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        System.out.println("Insira x e y: ");
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);
        entrada.close();
    }
}
