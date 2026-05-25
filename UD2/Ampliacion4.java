import java.util.Scanner;

public class Ampliacion4 {

    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        int tlf;
        double estatura;
        String nombre;
        char genero;

        System.out.println("Genero: ");
        genero = sc.nextLine().charAt(0);
        System.out.println("Nombre:");
        nombre = sc.nextLine();
        System.out.println("Telefono:");
        // tlf = sc.nextInt();
        tlf = Integer.parseInt(sc.nextLine());
        System.out.println("Estatura:");
        // estatura = sc.nextDouble();
        estatura = Double.parseDouble(sc.nextLine());

        System.out.printf("\n Telefono: %d \n Nombre: %s \n Estatura: %.2f \n Genero: %c \n ", tlf, nombre, estatura,
                genero);

    }
}