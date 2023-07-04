package j2.l3;

public class exercicio9_3 {
    public static void main(String[] args){
        int i = 0, j = 1, k = 0;
        do {
            System.out.print(j + " ");
            int l = k + j;
            k = j;
            j = l;

            i++;
        } while (i <= 9);
    }
}