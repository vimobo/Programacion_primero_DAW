import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int x1, x2, operacion;
        // pedimos los datos
        System.out.println("Introduce el valor de x1");
        x1 = sc.nextInt();
        System.out.println("Introduce el valor de x2");
        x2 = sc.nextInt();
        System.out.println("Elige la operación que deseas realizar \n1 sumar \n2 restar\n3 multiplicar\n4 dividir");
        operacion = sc.nextInt();

        // Switch
        switch (operacion) {
            case 1:
                System.out.println("suma de" + x1 + " " + x2 + "=" + (x1 + x2));
                break;
            case 2:
                System.out.println("resta de" + x1 + " " + x2 + "=" + (x1 - x2));
                break;
            case 3:
                System.out.println("multiplicación de" + x1 + " " + x2 + "=" + (x1 * x2));
                break;
            case 4:
                System.out.println("division de" + x1 + " " + x2 + "=" + ((double) x1 / x2));
                break;
            default:
                System.out.println("Elige sabiamente");
        }
    }
}