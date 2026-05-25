import java.util.Scanner;

public class Ampliacion10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadenaTexto = " ";
        String cadenaMinuscula = " ";
        int i = 0;
        int cadenaLength = 0;
        char letra = ' ';
        char ultimaLetra = ' ';
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

        cadenaLength = cadenaTexto.length();

        System.out.println("");
        for (i = 0; i < cadenaLength; i++) {

            if (i == 0 || ultimaLetra == ' ') {
                letra = cadenaTexto.toUpperCase().charAt(i);
                System.out.printf("%c", letra);
            }

            else {
                letra = cadenaTexto.toLowerCase().charAt(i);
                System.out.printf("%c", letra);
            }
            ultimaLetra = letra;
        }
    }
}