import java.util.Scanner;

public class Ampliacion7 {

    public static void main(String[] args) {

        // Variables y Scanner
        Scanner sc = new Scanner(System.in);
        String cad1, cad2, cad3;
        // Pedimos por pantalla
        System.out.println("Introduce cadena 1: ");
        cad1 = sc.nextLine();
        System.out.println("Introduce cadena 1: ");
        cad2 = sc.nextLine();

        // resolución
        cad3 = cad1;
        cad1 = cad2;
        cad2 = cad3;

        // imprimimos
        System.out.println("La cadena 1 ahora es " + cad1 + " y la dos " + cad2);

    }

}