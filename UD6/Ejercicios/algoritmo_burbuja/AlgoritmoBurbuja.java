package algoritmo_burbuja;

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmoBurbuja {

    // Clase de pruba para el algoritmo burbuja, con el objetivo de ordenar una
    // array
    public static int[] burbuja(int[] arrayOriginal) {
        int aux = 0;
        int[] array = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    AlgoritmoBurbuja.imprirArray(array);
                    sc.nextLine();
                }
            }
        }
        return array;
    }

    public static void imprirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println("]");

    }

    // main para comprobar el funcionamiento
    public static void main(String[] args) {

        int[] arrayOriginal = { 4, 7, 9, 1, -3, 6, 2 };
        int[] array = AlgoritmoBurbuja.burbuja(arrayOriginal);

        System.out.print("Original: ");
        AlgoritmoBurbuja.imprirArray(arrayOriginal);
    }
}