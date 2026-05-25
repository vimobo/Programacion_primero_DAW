import java.util.Scanner;

public class EstructuraCondicional5 {

    public static void main(String[] args) {
        // declaramos variables
        Scanner sc = new Scanner(System.in);
        String user, pass;
        // introducimos numero
        System.out.println("Introduce el ususario");
        user = sc.nextLine();
        System.out.println("Introduce la contraseña");
        pass = sc.nextLine();
        // condición
        if (user.equals("pepe") && pass.equals("asdasd")) {
            System.out.println("estas dentro");
        } else {
            System.out.println("El user o pass es incorrecto");
        }
    }
}
