import java.util.Scanner;

public class EstructurasRepetitivas4 {

    public static void main(String[] args) {
        // declaracion de variables y objeto scanner
        Scanner sc = new Scanner(System.in);

        int recuentoMayor = 0, recuentoMenor = 0, recuentoIgual = 0;
        int i = 0;
        int cuantosNumeros, numero;

        // introducimos datos y bucle for
        System.out.println("Introduce una cantidad de numeros");
        cuantosNumeros = sc.nextInt();

        for (i = 1; i <= cuantosNumeros; i++) {
            System.out.println("introduce el numero " + i);
            numero = sc.nextInt();

            if (numero == 0)
                recuentoIgual++;
            else if (numero > 0)
                recuentoMayor++;
            else if (numero < 0)
                recuentoMenor++;
        }

        // Imprimimos por pantalla
        System.out.println("la cantidad de numeros mayor que 0 es " + recuentoMayor);
        System.out.println("la cantidad de numeros menor que 0 es " + recuentoMenor);
        System.out.println("la cantidad de numeros mayor que 0 es " + recuentoIgual);
    }
}