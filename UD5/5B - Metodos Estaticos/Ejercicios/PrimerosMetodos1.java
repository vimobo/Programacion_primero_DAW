import java.util.Scanner;

public class PrimerosMetodos1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("obtener signo");
        System.out.println(obtenerSigno(0.0));

        System.out.println("x = 1");
        // 1
        System.out.println("No hace nada");
        noHaceNada();

        // 2
        System.out.println("No hace nada");
        System.out.println(incremento1(1));

        // 3
        System.out.println("Sumar 1.5 y 3.2");
        System.out.println(sumarDosNumeros(1.5, 3.2));

        // 4
        System.out.println("limpiar pantalla");
        limiarPantalla();
        /*
         * //5
         * System.out.println("introduce n para hacer el cuadrado");
         * x = Integer.parseInt(sc.nextLine());
         * imprimirCuadrado(x);
         * 
         * //6
         * System.out.println("obtener signo");
         * x = Integer.parseInt(sc.nextLine());
         * System.out.println(obtenerSigno(x));
         */
        // 7
        System.out.println("dime un num para saber si es primo");
        x = Integer.parseInt(sc.nextLine());
        System.out.println(esPrimo(x));

        // 8
        System.out.println("Es un numero?");
        char c = sc.nextLine().charAt(0);
        System.out.println(esUnNumero(c));
    }

    public static int devolverFactorial(int x) {
        int y = 0;
        for (int i = x - 1; i > 0; i--) {
            y *= i;
        }
        return y;
    }

    public static void noHaceNada() {

    }

    public static int incremento1(int i) {
        return i + 1;
    }

    public static double sumarDosNumeros(double i, double j) {
        return i + j;
    }

    public static void limiarPantalla() {
        for (int i = 0; i <= 25; i++) {
            System.out.println("");
        }
    }

    public static void imprimirCuadrado(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static int obtenerSigno(double x) {
        int y;
        if (x > 0)
            y = 1;
        else if (x < 0)
            y = -1;
        else
            y = 0;
        return y;
    }

    public static int esPrimo(int x) {
        int y = 0;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0)
                y = 0;
            else
                y = x;
        }
        return y;
    }

    public static boolean esUnNumero(char c) {
        boolean esUnNumero = false;

        if (c >= '0' && c <= '9')
            esUnNumero = true;

        return esUnNumero;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}