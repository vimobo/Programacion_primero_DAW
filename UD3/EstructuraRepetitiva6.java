import java.util.Scanner;

public class EstructuraRepetitiva6 {

    public static void main(String[] args) {

        // declaramos variables, ojb scanner y pedimos al usuario
        Scanner sc = new Scanner(System.in);
        int numero, numero1;

        System.out.println("Introduce un numero de inicio");
        numero = sc.nextInt();
        System.out.println("Introduce un segundo numero mayor");
        numero1 = sc.nextInt();
        System.out.println("*******************************");

        // if para ajustar a un numero par
        if (numero % 2 == 1)
            numero += 1;

        // bucle while para imprimir
        while (numero <= numero1) {
            System.out.println(numero);
            numero += 2;
        }
    }
}