/**. Clase de Datos: Alumno

Esta clase representa la unidad básica. Se espera que tenga un estado interno protegido y métodos para interactuar con sus datos.

    Atributos (Estado):

        id (int): Identificador único.

        nombre (String): Nombre del alumno.

        notaMedia (double): La calificación para poder ordenar por ella.

    Métodos Necesarios:

        Constructor: Para inicializar el objeto con datos al momento de crearlo.

        Getters y Setters: Especialmente el getNotaMedia() y getNombre(), esenciales para que la clase principal pueda "leer" dentro del objeto y decidir cómo ordenar.

        Método toString(): Sobrescribir este método para definir cómo se debe imprimir el alumno cuando lo mostremos en una lista. */

package academia;

import java.util.Arrays;

public class Alumno implements Comparable<Alumno> {

    private final int TRIMESTRES = 3;
    private static int contador;
    private int id;
    private String nombre;
    private double[] arrayNotas;

    @Override
    public int compareTo(Alumno otro) {
        return this.nombre.compareTo(otro.nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public Alumno() {
        id = contador;
        contador++;
        nombre = "";
        arrayNotas = new double[TRIMESTRES];
    }

    // constructor con id autoprogresivo
    public Alumno(String nombre, double nota1, double nota2, double nota3) {

        id = contador;
        contador++;

        this.nombre = nombre;

        arrayNotas = new double[TRIMESTRES];
        this.arrayNotas[0] = nota1;
        this.arrayNotas[1] = nota2;
        this.arrayNotas[2] = nota3;
    }

    public Alumno(String nombre, double nota1, double nota2) {

        id = contador;
        contador++;

        this.nombre = nombre;

        arrayNotas = new double[TRIMESTRES];
        this.arrayNotas[0] = nota1;
        this.arrayNotas[1] = nota2;
        this.arrayNotas[2] = -1.0;
    }

    public Alumno(String nombre, double nota1) {

        id = contador;
        contador++;

        this.nombre = nombre;

        arrayNotas = new double[TRIMESTRES];
        this.arrayNotas[0] = nota1;
        this.arrayNotas[1] = -1.0;
        this.arrayNotas[2] = -1.0;
    }

    public String toString() {
        return "\nid: " + id +
                "\nAlumno: " + nombre + "\nnotas:  " +
                Arrays.toString(arrayNotas) + "\n*****************************";
    }

    public double[] getArrayNotas() {
        return this.arrayNotas;
    }

    public void setArrayNotas(double nota1) {
        this.arrayNotas[0] = nota1;
    }

    public void setArrayNotas(double nota1, double nota2) {
        this.arrayNotas[0] = nota1;
        this.arrayNotas[1] = nota2;
    }

    public int getId() {
        return id;
    }

    public void setArrayNotas(double nota1, double nota2, double nota3) {
        this.arrayNotas[0] = nota1;
        this.arrayNotas[1] = nota2;
        this.arrayNotas[2] = nota3;
    }

    public double getNotaMedia() {
        double notaMedia = 0.0;
        int contador = 0;
        for (int i = 0; i < arrayNotas.length; i++) {
            if (arrayNotas[i] != -1.0) {
                notaMedia += arrayNotas[i];
                contador++;
            }
        }
        if (contador > 0)
            notaMedia /= contador;
        return notaMedia;
    }

}