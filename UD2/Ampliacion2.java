import java.util.Scanner;

public class Ampliacion2 {

    public static void main(String[] args) {

        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        boolean comprobacion;
        int a, b;

        // pedimos valores
        System.out.println("Introduce valor A");
        a = sc.nextInt();
        System.out.println("Introduce valor B");
        b = sc.nextInt();

        // Resolucion e imprimimos por pantalla
        comprobacion = a == b;
        System.out.printf("%d es igual que %d: %b \n", a, b, comprobacion);
        comprobacion = a != b;
        System.out.printf("%d es diferente que %d: %b \n", a, b, comprobacion);
        comprobacion = a < b;
        System.out.printf("%d es menor  que %d: %b \n", a, b, comprobacion);
        comprobacion = a > b;
        System.out.printf("%d es mayor que %d: %b \n", a, b, comprobacion);
        comprobacion = a <= b;
        System.out.printf("%d es menor o igual que %d: %b \n", a, b, comprobacion);
        comprobacion = a >= b;
        System.out.printf("%d es mayor o igual que %d: %b \n", a, b, comprobacion);

    }
}
