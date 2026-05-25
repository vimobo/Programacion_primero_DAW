import java.util.Scanner;

public class Ampliacion7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cmX = 0;
        int cmY = 0;
        boolean bordado = false;
        double cm2;
        double precio = 0;
        boolean repetir = false;

        do {
            try {

                sc.nextLine();
                System.out.println("Introduce la altura (cm)");
                cmX = sc.nextInt();
                System.out.println("Introduce la anchura (cm)");
                cmY = sc.nextInt();
                System.out.println("quieres bordado?");
                bordado = sc.nextBoolean();

                if (cmX < 0 || cmY < 0) {
                    repetir = true;
                }
            }

            catch (Exception e) {
                System.out.println("Introduce un numero entero");
                repetir = true;
            }
        } while (repetir);

        cm2 = cmX * cmY;

        if (bordado)
            precio += 2.5;

        precio = cm2 * 0.01;
        // precio += 3.25;

        System.out.println(precio);

    }
}