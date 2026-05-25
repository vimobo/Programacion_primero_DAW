import java.util.HashSet;

/**
 * Imagina que estás desarrollando un sistema de control de asistencia a clase.
 * Implementa un
 * programa usando una colección HashSet que contenga nombres de alumnos que
 * hayan asistido a
 * clase (pueden ser ficticios), y muéstralos por pantalla haciendo uso de la
 * sintaxis de foreach.
 * Prueba a añadir un duplicado y observa lo que ocurre.
 */
public class ControlAsistencia {
    public static void main(String[] args) {
        HashSet<String> coleccion = new HashSet<>();
        coleccion.add("Antonio");
        coleccion.add("Felicio");
        // no se añade el duplicado
        coleccion.add("Felicio");
        coleccion.add("Ricardo");

        for (String item : coleccion) {
            System.out.println(item);
        }
    }
}