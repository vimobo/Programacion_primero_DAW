import java.util.Scanner;

public class Ampliacion3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double x = 0;
        double x2 = 0;
        double c = 0;
        boolean excepcion = true;

        do {

            try {

                System.out.println("Introduce a");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Introduce b");
                b = Double.parseDouble(sc.nextLine());
                System.out.println("Introduce c");
                c = Double.parseDouble(sc.nextLine());

                if (a == 0) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    x = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                    System.out.println(x);
                    x2 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                    System.out.println(x2);
                }
            } catch (Exception e) {
                System.out.println("Hay una excepcion");
                excepcion = false;
            }
        } while (!excepcion);

    }
}