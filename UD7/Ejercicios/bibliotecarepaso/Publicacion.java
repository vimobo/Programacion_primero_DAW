public class Publicacion {

    // att
    protected String isbn;
    protected String titulo;
    protected int anioPublicacion;

    //
    public Publicacion(String isbn, String titulo, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public boolean estaPrestado() {
        return true;
    }

    public String toString() {
        return "\nIsbn: " + isbn +
                "\nTitulo: " + titulo +
                "\nAño Publicacion: " + anioPublicacion;
    }

}