import java.util.Scanner;

public class EstructuraCondicional2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean comprobacion;
        System.out.println("Introduce un numero entero");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {

            if (numero < 0) {
                System.out.println("EL numero es negativo");
            } else {
                System.out.println("El numero es 0");
            }
        }

    }

}