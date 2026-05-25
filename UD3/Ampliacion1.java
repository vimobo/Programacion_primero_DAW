import java.util.Scanner;

public class Ampliacion1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        try {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            esVerdad = true;
        } catch (Exception e) {
            System.out.println("Introduce un numero entero cojoneh'");
            esVerdad = false;
        }

        switch (num) {
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("El numero es nulo");
                break;

        }

    }
}