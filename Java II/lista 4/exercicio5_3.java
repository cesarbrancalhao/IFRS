package j2.l4;

import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercicio5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número real.");
        double num = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        String numUp = df.format(num);

        System.out.println("Número arredondado: " + numUp);
    }
}
