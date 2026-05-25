import java.util.Scanner;

public class EstructurasRepetitivas5 {

    public static void main(String[] args) {

        // declaracioon de variables
        Scanner sc = new Scanner(System.in);
        char letra = '_';

        // bucle while
        while (letra != ' ') {
            System.out.println("Introduce una letra");
            letra = Character.toLowerCase(sc.nextLine().charAt(0));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                System.out.println("VOCAL");
            else if (letra == ' ')
                System.out.println("se acabo el programa");
            else
                System.out.println("NO VOCAL");

        }
    }
}