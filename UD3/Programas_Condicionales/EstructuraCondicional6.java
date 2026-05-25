import java.util.Scanner;

public class EstructuraCondicional6 {

    public static void main(String[] args) {
        // declaramos variables
        Scanner sc = new Scanner(System.in);
        String letra;
        // introducimos numero
        System.out.println("Introduce una palabra");
        letra = sc.nextLine();
        // condición
        if (letra.length() == 1) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
