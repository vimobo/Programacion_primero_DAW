import java.util.InputMismatchException;
import java.util.Scanner;

public class Ampliacion5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int resultado = 0;

        try {
            System.out.println("Introduce un numero");
            num = sc.nextInt();

            if (num < 10) {
                resultado = num;
            } else if (num < 100) {
                resultado = num / 10;
            } else if (num < 1000) {
                resultado = num / 100;
            } else if (num < 10000) {
                resultado = num / 1000;
            } else {
                System.out.println("el numero es demasiado grande");
            }

            System.out.println(resultado);
        } catch (InputMismatchException e) {
            System.out.println("Se ha generado una excepcion de input");
        } catch (Exception e) {
            System.out.println("Se ha generado una excepcion");
        }
    }
}