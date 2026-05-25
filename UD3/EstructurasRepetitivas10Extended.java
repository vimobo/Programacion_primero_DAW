import java.util.Scanner;

public class EstructurasRepetitivas10Extended {

    public static void main(String[] args) {

        // declaracion de variables y obj scanner
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 2;
        int i = 2;
        String mensajeSalida = " ";

        do {

            // pedimos el valor
            System.out.println("introduce un numero para saber si es primo");
            numero = Integer.parseInt(sc.nextLine());

            // bucle for para determinar si el numero solo es divisible por el mimso

            // reset del contador
            i = 2;
            do {
                resultado = numero % i;
                i++;
            } while (resultado != 0);

            // restamos 1 a i para compensar el ultimo bucle
            // condicional comparativa
            i -= 1;
            if (i == numero) {
                System.out.printf("\n%d es divisible por %d dando resto 0\nPor tanto %d es primo\n", numero, i, numero);
            } else {
                System.out.printf("\n%d es divisible por %d dando resto 0\nPor tanto %d no es primo\n", numero, i,
                        numero);
            }

            System.out.println("\nIntroduce salir para apagar el programa \npresiona enter para continuar");
            mensajeSalida = sc.nextLine();
        } while (!mensajeSalida.equals("salir"));
    }
}
