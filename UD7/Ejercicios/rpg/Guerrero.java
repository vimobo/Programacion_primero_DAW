public class Guerrero extends Personaje implements Atacante {

    public Guerrero(String nombre, int puntosVida, int puntosMagia) {
        super(nombre, puntosVida, puntosMagia);
    }

    @Override
    public boolean atacar(Personaje objetivo) throws PersonajeException {
        boolean realizado = false;

        if (objetivo.puntosVida - 20 >= 0) {

            objetivo.puntosVida = puntosVida - 20;
            realizado = true;
        } else {
            throw new PersonajeException(this.nombre + " ha matado a " + objetivo.nombre);
        }
        return realizado;
    }

}