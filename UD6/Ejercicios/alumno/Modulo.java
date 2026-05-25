package alumno;

public class Modulo {

    private String nombre;
    private String curso;
    private String profe;
    private Alumno[] arrayAlumnos;

    public Modulo(String nombre, String curso, String profe) {
        this.nombre = nombre;
        this.curso = curso;
        this.profe = profe;
        this.arrayAlumnos = new Alumno[5];
    }

    public void addAlumno(Alumno alumno, int i) {
        arrayAlumnos[i] = alumno;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // metodo to string con condicional para no contar nulls
    public String toString() {
        String informeFinal = "\nCurso: " + curso
                + "\nnombre: " + nombre
                + "\nprofe: " + profe
                + "\n";

        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (arrayAlumnos[i] != null) {
                informeFinal += "\nalumno " + i + ": \n" + arrayAlumnos[i].toString() + "\nNota final: "
                        + arrayAlumnos[i].calcularCalificacionFinal() + "\n";
            }
        }
        return informeFinal;
    }

    // metodo par acalcular la media del trimestre de todos los alumnos
    public int calcularMediaTrimestre(int trimestre) {
        int media = 0;
        int contador = 0;
        boolean trimestreCompletado = true;

        // se tienen en cuenta los alumnos sin las notas puestas
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (arrayAlumnos[i] != null || arrayAlumnos[i].notas[trimestre] != -1) {
                media += arrayAlumnos[i].notas[trimestre];
                contador++;
                System.out.println(" i: " + i + " total: " + media);
                System.out.println("contador " + contador);
            }
            if (arrayAlumnos[i].notas[trimestre] == -1) {
                trimestreCompletado = false;
            }
        }
        if (contador != 0) {
            media /= contador;
        }
        if (!trimestreCompletado)
            media = -1;
        return media;
    }
}