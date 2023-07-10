package POO;

public class teste {
    public static void main(String[] args) {
        char model;
        char color;
        double tip;
        int load;
        boolean capped = false;

        doodle(capped);
        cap(capped);
    }

    public static void doodle(boolean a) {
        if (a == false)
            System.out.println("Rabisco");
        else{System.out.println("Tampada");}
    }
    public static boolean cap(boolean a) {
        if (a == false)
            a = true;
        return a;
    }
}
