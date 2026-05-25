public class Publicacion {

    // att
    protected int isbn;
    protected String titulo;
    protected int anioPublicacion;

    // Constructor
    public Publicacion(int isbn, String titulo, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anioPublicacion;
    }

}