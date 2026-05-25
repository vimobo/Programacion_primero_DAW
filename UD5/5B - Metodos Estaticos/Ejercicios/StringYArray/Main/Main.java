
/**Ejercicio3
Para resolver este ejercicio crea en una clase StringYArray con los siguientes métodos estáticos.
Para probar los diferentes métodos, crea otra clase Principal con el método main donde se haga uso
de los métodos de la clase.
1. Crea un método que reciba dos cadenas y devuelva la concatenación de esas dos cadenas.
2. Crea un método que reciba una cadena y devuelva un array. En cada posición del array un
carácter de la cadena.
3. Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve una cadena de
caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve
“”; si a = { 8 }, convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 },
convierteArrayEnString(a) devuelve “62501” */

import trabajo_cadenas.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        String cad1 = "";
        String cad2 = "";

        do {

            System.out.println("\nmenu:");
            System.out.println("1 - crear cad1 ");
            System.out.println("2 - Crear cad2 ");
            System.out.println("3 - concatenar cadena ");
            System.out.println("4 - Array a char");
            System.out.println("5 - String a char array");
            System.out.println("");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Cad1: ");
                    cad1 = sc.nextLine();
                    break;

                case 2:
                    System.out.print("Cad2: ");
                    cad2 = sc.nextLine();
                    break;

                case 3:
                    System.out.println("cad1 = " + cad1 + " cad2 = " + cad2);
                    System.out.println(TrabajoCadenas.concatenarCadenas(cad1, cad2));
                    break;

                case 4:
                    System.out.println("Devuelve un array de char");
                    System.out.println(Arrays.toString(TrabajoCadenas.cadenaAArray(cad1)));
                    break;

                case 5:
                    int[] array = TrabajoCadenas.crearArray(5);
                    System.out.println(Arrays.toString(array));
                    System.out.println(TrabajoCadenas.convierteArrayEnString(array));
                    break;

            }

        } while (opcion != 0);
    }
}
