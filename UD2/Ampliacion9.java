import java.util.Scanner;

public class Ampliacion9 {

    public static void main(String[] args) {

        // objeto Scanner y variables
        Scanner sc = new Scanner(System.in);
        int edad;
        // pedimos por pantalla
        System.out.println("Introduce tu edad");
        edad = sc.nextInt();
        // resolución
        System.out.println(((edad >= 18) ? "Eres mayor de edad" : "Eres mayor de edad"));
    }
}