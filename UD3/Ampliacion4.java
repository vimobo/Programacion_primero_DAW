import java.util.Scanner;

public class Ampliacion4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int ultima;
        boolean bulce = true;
        do {
            try {
                System.out.println("Introduce un numero");
                num = Integer.parseInt(sc.nextLine());

                ultima = Math.abs(num % 10);

                System.out.println(ultima);
            }

            catch (NumberFormatException e) {
                System.out.println("Se ha generado una excepcion de formato");

                bulce = false;
            }

            catch (Exception e) {
                System.out.println("Se ha generado una excepcion generica");

                bulce = false;
            }

        } while (!bulce);
    }
}