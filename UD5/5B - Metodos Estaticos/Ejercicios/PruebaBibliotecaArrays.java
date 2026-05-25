import java.util.Scanner;
import java.util.Arrays;

public class PruebaBibliotecaArrays {

    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[0];

        do {
            System.out.println("\nElige la opcion: ");
            System.out.println("1 - genera Arrays");
            System.out.println("2 - saca el minimo del array");
            System.out.println("3 - Maximo Array");
            System.out.println("4 - Media Array");
            System.out.println("5 - Esta en el Array");
            System.out.println("6 - Posicion en array");
            System.out.println("7 - Volear Array");
            System.out.println("8 - rotar derecha");
            System.out.println("9 - Rotar Izquierda");
            System.out.println("0 - salir");

            opcion = sc.nextInt();

            array = PruebaBibliotecaArrays.operacionesConArrays(opcion, array);

        } while (opcion != 0);

        // System.out.println(array[0]);
    }

    public static int[] operacionesConArrays(int opcion, int[] array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int numero;

        switch (opcion) {
            case 1:
                array = BibliotecaArrays.generaArrays(10, 100, 50);
                System.out.println(Arrays.toString(array));
                break;
            case 2:
                System.out.println("minimo = " + BibliotecaArrays.minimoArray(array));
                break;
            case 3:
                System.out.println("maximo = " + BibliotecaArrays.maximoArray(array));
                break;
            case 4:
                System.out.println("media = " + BibliotecaArrays.mediaArray(array));
                break;
            case 5:
                System.out.println("Introduce un numero para saber si esta en el array: ");
                numero = sc.nextInt();
                System.out.println(numero + " se encuentra en el array " + Arrays.toString(array) + " "
                        + BibliotecaArrays.contieneNumero(array, numero));
                break;
            case 6:
                System.out.println("Introduce un numero para saber si esta en el array: ");
                numero = sc.nextInt();
                System.out.println(numero + " se encuentra en el array " + Arrays.toString(array) + " en la posicion "
                        + BibliotecaArrays.posicionNumero(array, numero));
                break;
            case 7:
                System.out.println("volteado = " + Arrays.toString(BibliotecaArrays.voltearArray(array)));
                break;
            case 8:
                array = BibliotecaArrays.rotarDerecha(array, 2);
                System.out.println("Rotado a la derecha = " + Arrays.toString(array));
                break;
            case 9:
                System.out.println(
                        "Rotado a la izquierda = " + Arrays.toString(BibliotecaArrays.rotarIzquierda(array, 2)));
                break;
            default:
                System.out.println("Chaoo");
                break;
        }
        return array;
    }
}