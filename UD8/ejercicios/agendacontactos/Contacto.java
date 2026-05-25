/**
 * Estás desarrollando una aplicación para gestionar contactos, y debes
 * asegurarte de que no existan
 * contactos duplicados y que estos aparecen en orden alfabético. Crea un
 * programa en Java que haga
 * uso de un TreeSet para almacenar objetos de la clase Contacto, que deberéis
 * implementar
 * previamente y que contenga, como atributos de tipo String, el nombre,
 * teléfono y correo del
 * contacto. Muestra los contactos por pantalla y prueba a añadir un duplicado.
 * Ayuda : los TreeSet son conjuntos ordenados por lo que hay que decirles como
 * se ordenan nuestras
 * clases.
 */

public class Contacto implements Comparable {
    private String nombre;
    private String correo;
    private int telefono;

    public Contacto(String nombre, String correo, int telefono) {
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object obj) {
        return nombre.compareTo(((Contacto) obj).nombre);
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (this.nombre.equals(((Contacto) obj).nombre) &&
                this.correo.equals(((Contacto) obj).correo) &&
                this.telefono == ((Contacto) obj).telefono)
            isEqual = true;
        return isEqual;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nCorreo: " + correo +
                "\nTelefono: " + telefono;
    }
}