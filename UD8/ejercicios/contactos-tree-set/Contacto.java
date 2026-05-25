//Clase contacto para almacenar en un tree set
public class Contacto implements Comparable {
    private String nombre;
    private int numero;
    private String correo;

    public Contacto(String nombre, int numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    @Override
    public int compareTo(Object obj) {
        return this.getNombre().compareTo(((Contacto) obj).getNombre());
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCorreo() {
        return this.correo;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if (this.getNombre().equals(((Contacto) obj).getNombre())
                && this.getNumero() == ((Contacto) obj).getNumero() &&
                this.getCorreo().equals(((Contacto) obj).getCorreo()))
            equals = true;
        return equals;
    }

    @Override
    public String toString() {
        return this.nombre + "\n" +
                this.numero + "\n" +
                this.correo;
    }
}