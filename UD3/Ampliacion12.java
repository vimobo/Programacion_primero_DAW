import java.util.Scanner;

public class Ampliacion12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = 0;
        int i = 0;
        int contador = 1;
        int division = 11;
        boolean repetirBucle = false;

        do {
            try {
                System.out.println("Introduce un numero entero");
                numeroIntroducido = Integer.parseInt(sc.nextLine());
                repetirBucle = false;
            }

            catch (Exception e) {
                System.out.println("Hay una excepcion");
                repetirBucle = true;
            }

        } while (repetirBucle);

        numeroIntroducido = Math.abs(numeroIntroducido);

        for (i = 10; division > 10; i *= 10) {
            division = numeroIntroducido / i;
            contador++;
        }

        if (numeroIntroducido < 10) {
            System.out.println("El numero " + numeroIntroducido + " tiene 1 cifra");
        }

        else {
            System.out.println("El numero " + numeroIntroducido + " tiene " + contador + " cifras");
        }
    }
}