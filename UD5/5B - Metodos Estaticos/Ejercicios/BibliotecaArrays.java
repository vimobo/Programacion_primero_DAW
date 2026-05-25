/*Ejercicio 2
Crea una clase bibliotecaArrays con los siguientes métodos.
1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo
(mínimo y máximo) se indica como parámetro.
2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
5. estaEnArrayInt: Dice si un número está o no dentro de un array.
6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que
se encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
10. main para probar los métodos anteriores.*/

import java.util.Scanner;
import java.util.Arrays;

public class BibliotecaArrays {

    public static int[] generaArrays(int n, int x, int y) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (x - y + 1) + y);
        }
        return array;
    }

    public static int minimoArray(int array[]) {

        int minimo = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < minimo)
                minimo = array[i];
        }
        return minimo;
    }

    public static int maximoArray(int array[]) {

        int maximo = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maximo)
                maximo = array[i];
        }
        return maximo;
    }

    public static int mediaArray(int[] array) {

        int media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        media /= array.length;
        return media;
    }

    public static int[] voltearArray(int[] array) {

        int[] arrayNuevo = new int[array.length];
        int contador = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrayNuevo[i] = array[contador];
            contador++;
        }
        return arrayNuevo;
    }

    public static int[] rotarDerecha(int[] array, int repeticiones) {

        int[] rotado = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rotado[(i + repeticiones) % array.length] = array[i];
        }
        return rotado;
    }

    public static int[] rotarIzquierda(int[] array, int repeticiones) {

        int[] rotado = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            rotado[i] = array[(i + repeticiones) % array.length];
        }
        return rotado;
    }

    public static boolean contieneNumero(int[] array, int x) {
        boolean contieneNumeroBool = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                contieneNumeroBool = true;
        }
        return contieneNumeroBool;
    }

    public static int posicionNumero(int[] array, int contieneNumero) {
        int posicion = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == contieneNumero)
                posicion = i;
        }
        return posicion;
    }
}
