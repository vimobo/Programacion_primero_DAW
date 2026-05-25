import java.util.Scanner;

public class Ampliacion2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double x = 0;
        boolean control = false;
        String salida;

        do {
            do {
                try {
                    System.out.println("Introduce a");
                    a = Double.parseDouble(sc.nextLine());
                    System.out.println("Introduce b");
                    b = Double.parseDouble(sc.nextLine());
                    control = true;

                } catch (NumberFormatException e) {
                    System.out.println("Los datos introducidos son incorrectos");
                } catch (ArithmeticException e) {
                    System.out.println("No se puede dividir por cero");
                } catch (Exception e) {
                    System.out.println("Ha pasado una excepcion");
                }

            } while (!control);

            x = -b / a;
            System.out.println(x);

            System.out.println("Introduce \"s\" para salir, si quieres volver a empezar pulsa enter");
            salida = sc.nextLine();

        } while (!salida.equals("s"));

    }
}