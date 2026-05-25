public abstract class Personaje {

    // att
    protected String nombre;
    protected int puntosVida;
    protected int puntosMagia;

    // constructor
    public Personaje(String nombre, int puntosVida, int puntosMagia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosMagia = puntosMagia;
    }

    public String toString() {
        return "\nNombre: " + nombre +
                "\nSalud: " + puntosVida +
                "\nMagia: " + puntosMagia;

    }
}