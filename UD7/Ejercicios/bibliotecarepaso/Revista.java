public class Revista extends Publicacion {

    private int nRevista;
    private static int contador;

    public Revista(String isbn, String titulo, int anioPublicacion, int nRevista) {
        super(isbn, titulo, anioPublicacion);
        this.nRevista = nRevista;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumero Revista: " + nRevista;
    }
}