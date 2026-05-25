import java.util.Scanner;

public class Ampli3 {

    static final int MAYOR = 18;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char letra;
        String palabra, combo;
        int edad;

        System.out.println("numero");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("letra");
        letra = sc.nextLine().charAt(0);
        System.out.println("palabra");
        palabra = sc.nextLine();
        combo = palabra + letra;
        System.out.println(combo + edad);
        System.out.println((edad >= MAYOR) ? "hehe" : "hoho");
    }
}