import java.time.LocalDate;
import java.util.GregorianCalendar;

/**Ejercicio – Gestión de una lista de reproducción musical

Vas a implementar una aplicación que gestione una lista de canciones de una plataforma tipo Spotify.

De cada canción interesa conocer:

id
título
artista
duración (segundos)
disponible (true/false)

Un usuario puede añadir canciones a una lista de reproducción, pero antes de reproducirla el sistema debe validarla siguiendo estas reglas:

Eliminar canciones no disponibles (disponible = false).
Eliminar canciones con duración inválida (duración <= 0).
Eliminar anuncios antiguos representados como canciones cuyo título empieza por "AD-".
Mostrar la duración total final de la lista.

Usa la colección que consideres más adecuada */

public class Cancion {
    private int id;
    private String titulo;
    private String artista;
    private double duracion;
    private boolean disponible;
    private LocalDate fechaInsercion;
    private int reproduccionesTotales;

    public Cancion(int id, String título, String artista, double duracion, boolean disponible) {
        this.id = id;
        this.titulo = título;
        this.artista = artista;
        this.duracion = duracion;
        this.disponible = disponible;
        this.fechaInsercion = LocalDate.now();
        this.reproduccionesTotales = 0;
    }



    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setReproduccionesTotales(int total) {
        this.reproduccionesTotales = total;
    }

    public int getReproduccionesTotales(){
        return this.reproduccionesTotales;
    }

    @Override
    public String toString(){
        String cad;
        cad =
            "\n\n*********************" +
            "\n**** CANCION ****" +
            "\nid\t\t|\t\t" + this.id +
            "\ntitulo\t\t|\t\t" + this.titulo +
            "\nartista\t\t|\t\t" + this.artista +
            "\nduracion\t|\t\t" + this.duracion +
            "\ndisponible\t|\t\t" + this.disponible +
            "\nfechaInsercion\t|\t\t" + this.fechaInsercion ;
        return cad;
    } 
}
