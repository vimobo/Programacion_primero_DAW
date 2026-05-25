import java.util.Scanner;

public class Condicionales8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char genero;
        int edad;
        double nota;

        System.out.println("Introduce tu edad");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce tu genero");
        genero = sc.nextLine().charAt(0);
        System.out.println("Introduce tu nota");
        nota = Double.parseDouble(sc.nextLine());

        if (nota < 5 || edad < 18) {
            System.out.println("No apto");
        }

        else {
            if (genero == 'F') {
                System.out.println("Apto");
            }

            else {
                System.out.println("Posible");
            }
        }
    }
}