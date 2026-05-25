public class Libro extends Publicacion implements Prestable {

    // att
    private boolean prestado;

    // constructor
    public Libro(int isbn, String titulo, int anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
        prestado = false;
    }

    // metodo del interfaz prestable
    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}