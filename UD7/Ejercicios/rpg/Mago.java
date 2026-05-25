public class Mago extends Personaje implements Atacante, Curador {

    public Mago(String nombre, int puntosVida, int puntosMagia) {
        super(nombre, puntosVida, puntosMagia);
    }

    @Override
    public boolean atacar(Personaje objetivo) throws PersonajeException {
        boolean realizado = false;

        if (objetivo.puntosVida - 20 >= 0 && this.puntosMagia - 10 >= 0) {
            objetivo.puntosVida = objetivo.puntosVida - 20;
            realizado = true;
            this.puntosMagia = this.puntosMagia - 15;

        } else {
            throw new PersonajeException(this.nombre + " ha matado a " + objetivo.nombre);
        }

        return realizado;
    }

    @Override
    public boolean curar(Personaje objetivo) throws PersonajeException {
        boolean realizado = false;

        if (objetivo.puntosVida >= 0 && this.puntosMagia - 15 >= 0) {
            objetivo.puntosVida = objetivo.puntosVida + 20;
            this.puntosMagia = this.puntosMagia - 15;
            realizado = true;
        } else {
            throw new PersonajeException("No se puede cura un muerto");
        }
        return realizado;
    }

}