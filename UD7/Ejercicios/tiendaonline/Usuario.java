public class Usuario {

    // atributos
    private static int cuentaId;
    protected int id;
    protected String nombre;
    protected String email;

    // constructor
    public Usuario(String nombre, String email) {
        id = cuentaId;
        cuentaId++;
        this.nombre = nombre;
        this.email = email;
    }

    public String toString() {
        return String.format("------------------\nId: %s\nNombre: %s\nEmail: %s", id, nombre, email);
    }
}
