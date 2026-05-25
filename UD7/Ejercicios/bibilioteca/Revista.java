public class Revista extends Publicacion {

    // att
    private int nRevista;

    // constructor
    public Revista(int isbn, String titulo, int anioPublicacion, int nRevista) {
        super(isbn, titulo, anioPublicacion);
        this.nRevista = nRevista;
    }
}