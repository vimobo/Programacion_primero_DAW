/*2. Clase Principal: GestionAcademia

Esta clase contiene la lógica del sistema y el manejo del Array de Objetos.
Estructura de Datos

    Array de Objetos: Un array de tipo Alumno[] con un tamaño definido por el usuario al inicio.

Métodos a Implementar (Lógica)

    llenarAlumnos():

        Qué hace: Un bucle que recorre el array vacío, pide los datos por consola e instancia un objeto new Alumno(...) en cada posición.

    mostrarAlumnos():

        Qué hace: Recorre el array e imprime cada objeto. Aquí es donde se usa el toString() de la clase Alumno.

    ordenarPorNota() (El núcleo del ejercicio):

        Lógica esperada: Implementar un algoritmo (como Burbuja o Selección).

        Condición: Debe comparar array[j].getNotaMedia() con array[j+1].getNotaMedia().

        Acción: Si la nota es mayor/menor, se debe intercambiar el objeto completo en el array, no solo el número de la nota.

    buscarPorNombre():

        Qué hace: Pide un nombre al usuario, recorre el array y utiliza .equals() para comparar el nombre buscado con el getNombre() de cada objeto. Si lo encuentra, muestra sus datos. */

package academia;

import java.util.Arrays;

public class Clase {

    private final int NALUM = 3;
    private Alumno[] arrayAlumnos;
    private int contadorAlumnos = 0;
    private String nombreAula;

    public Clase(String nombreAula) {
        this.nombreAula = nombreAula;
        arrayAlumnos = new Alumno[NALUM];
    }

    public void llenarAlumnos(Alumno alumno) {

        if (contadorAlumnos < 3) {

            arrayAlumnos[contadorAlumnos] = alumno;
            contadorAlumnos++;
        }

    }

    public void burbuja() {
        Alumno aux;
        for (int i = 0; i < NALUM; i++) {
            for (int j = 0; j < NALUM - 1 - i; j++) {
                if (arrayAlumnos[j] != null && arrayAlumnos[j + 1] != null) {
                    if (this.arrayAlumnos[j].getNombre().compareTo(arrayAlumnos[j + 1].getNombre()) == 1) {
                        aux = arrayAlumnos[j];
                        arrayAlumnos[j] = arrayAlumnos[j + 1];
                        arrayAlumnos[j + 1] = aux;
                    }
                }
            }
        }
    }

    public String imprimirArrayAlumnos() {
        String cadena = "";
        for (int i = 0; i < contadorAlumnos; i++) {
            cadena += arrayAlumnos[i].toString();
        }
        return cadena;
    }

    public void quitarAlumno(int id) {

        for (int i = id; i < NALUM - 1; i++) {
            arrayAlumnos[i] = arrayAlumnos[i + 1];
        }

        arrayAlumnos[NALUM - 1] = null;
        contadorAlumnos--;

    }

    public void ordenarArrayAlumnos() {
        Arrays.sort(arrayAlumnos);
    }

    public static void main(String[] args) {
        Alumno a1 = new Alumno("aikel", 2.3, 5.6, 7.8);
        Alumno a2 = new Alumno("coni", 2.3, 2.3);
        Alumno a3 = new Alumno("boni", 2.3, 2.3);
        Alumno a4 = new Alumno("toni", 2.3, 2.3);

        Clase c1 = new Clase("mates");

        c1.llenarAlumnos(a1);
        c1.llenarAlumnos(a2);
        c1.llenarAlumnos(a3);
        // System.out.println(c1.imprimirArrayAlumnos());
        // c1.llenarAlumnos(a4);

        c1.quitarAlumno(1);
        System.out.println(c1.imprimirArrayAlumnos());
        // a1.setArrayNotas(9.9);
        c1.burbuja();
        System.out.println(c1.imprimirArrayAlumnos());

        // System.out.println(Arrays.toString(a1.getArrayNotas()));

    }

}