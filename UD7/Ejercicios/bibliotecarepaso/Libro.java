public class Libro extends Publicacion implements Prestable {

    // att
    private boolean prestado;

    // constructor
    public Libro(String isbn, String titulo, int anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
        prestado = false;
    }

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