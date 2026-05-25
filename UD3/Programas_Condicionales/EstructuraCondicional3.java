import java.util.Scanner;

public class EstructuraCondicional3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        if ((numero % 2) == 0)
            System.out.println("el numero es par");
        else
            System.out.println("El numero es impar");
    }
}