package alumno;

import java.util.Arrays;

public class Alumno {

    // declaracion de atributos
    private String nombre;
    private String dni;
    public int[] notas = new int[3];

    // constructores
    public Alumno() {
        Arrays.fill(notas, -1);
    }

    public Alumno(String nombre, String dni, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.dni = dni;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    // getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota(int trimestre) {
        return notas[trimestre];
    }

    public void setNota(int nota, int trimestre) {
        this.notas[trimestre] = nota;
    }

    // o tambien llamado informe alumno
    public String toString() {
        return "nombre: " + nombre +
                "\ndni: " + dni +
                "\nnota 1: " + notas[0] +
                "\nnota 2: " + notas[1] +
                "\nnota 3: " + notas[2];
    }

    public int calcularCalificacionFinal() {
        int media;
        if (notas[0] == -1 || notas[1] == -1 || notas[2] == -1)
            media = -1;

        else
            media = (notas[0] + notas[1] + notas[2]) / 3;
        return media;
    }
}