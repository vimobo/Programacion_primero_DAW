import java.util.Scanner;

public class Ampliacion9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadenaTexto = " ";
        int longitudCadena;
        int i = 0;
        char letra;
        boolean repetirBucle = false;

        do {

            try {
                System.out.println("Introduce una palabra");
                cadenaTexto = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Introduce una cadena de texto válida");
                repetirBucle = false;
            }
        } while (repetirBucle);

        longitudCadena = cadenaTexto.length();

        for (i = 0; i < longitudCadena; i++) {
            letra = cadenaTexto.charAt(i);
            System.out.printf("\n Letra %d : %c\n", (i + 1), letra);
        }
    }
}