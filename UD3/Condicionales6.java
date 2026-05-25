import java.util.Scanner;

public class Condicionales6 {

    public static void main(String[] args) {

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        char letra;
        int numLetra;
        System.out.println("introduce un carácter");
        letra = sc.nextLine().charAt(0);
        numLetra = letra;
        if (numLetra >= 65 && numLetra < 97) {
            System.out.println(letra + " es Mayuscula");
        } else {
            System.out.println(letra + " es minuscula");
        }
    }
}