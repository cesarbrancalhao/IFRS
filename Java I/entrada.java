import java.util.Scanner;

public class entrada {
    public static void main(String[] args){
        System.out.println("Escreva a base e a altura do retângulo:");
        Scanner scanner = new Scanner(System.in);
        float base = scanner.nextFloat();
        float altura = scanner.nextFloat();
        float area = base * altura;

        System.out.println("Área do retângulo:" + area);
    }
}
