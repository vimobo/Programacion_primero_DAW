import java.util.Scanner;

public class Ampliacion11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadenaTexto = " ";
        int longitudTexto = 0;
        boolean repetirBucle = false;
        char caracter = ' ';
        int contadorVocal = 0;
        int contadorNumeros = 0;
        int contadorConsonante = 0;
        int i = 0;

        do {
            try {
                System.out.println("Introduce una cadena");
                cadenaTexto = sc.nextLine();
                repetirBucle = false;
            } catch (Exception e) {
                System.out.println("Ha habido una excepción\n");
                repetirBucle = true;
            }
        } while (repetirBucle);

        longitudTexto = cadenaTexto.length();

        for (i = 0; i < longitudTexto; i++) {
            caracter = cadenaTexto.toLowerCase().charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocal++;
            } else if (caracter >= '0' && caracter <= '9') {
                contadorNumeros++;
            } else if (caracter >= 98 && caracter <= 122) {
                contadorConsonante++;
            }
        }
        System.out.println("Numero de vocales: " + contadorVocal);
        System.out.println("Numero de consonantes: " + contadorConsonante);
        System.out.println("Numero de numeros: " + contadorNumeros);

    }
}