import java.util.Scanner;

public class EstructuraCondicional4 {

    public static void main(String[] args) {
        // declaramos variables
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        // introducimos numero
        System.out.println("Introduce num1");
        num1 = sc.nextDouble();
        System.ou.println("Introduce num2");
        num2 = sc.nextDouble();
        // condición

        if (num2 == 0)
            System.out.println("No se puede dividir por 0");
        else
            System.out.println("El resultado es " + (num1 / num2));

    }
}