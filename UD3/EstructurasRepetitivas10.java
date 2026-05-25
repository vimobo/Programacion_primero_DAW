import java.util.Scanner;

public class EstructurasRepetitivas10 {

    public static void main(String[] args) {

        // declaracion de variables y obj scanner
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 2;
        int i = 2;

        // pedimos el valor
        System.out.println("introduce un numero para saber si es primo");
        numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("1 no es primo");
            resultado = 0;
        }

        // bucle for para determinar si el numero solo es divisible por el mimso
        do {
            resultado = numero % i;
            i++;
        } while (resultado != 0 && i <= math.sqrt(num));

        // restamos 1 a i para compensar el ultimo bucle
        // condicional comparativa
        i -= 1;
        if (i == numero) {
            System.out.printf("\n%d es divisible por %d dando resto 0\nPor tanto %d es primo\n", numero, i, numero);
        } else {
            System.out.printf("\n%d es divisible por %d dando resto 0\nPor tanto %d no es primo\n", numero, i, numero);
        }

    }
}
