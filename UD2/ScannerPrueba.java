import java.util.Scanner;

public class ScannerPrueba {

    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor entero para saber su potencia en base 2");
        a = sc.nextLine();

        System.out.println("Tu valor al cuadrado es = " + a);
    }
}