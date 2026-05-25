public class Excavadora extends Maquinaria {

    // att
    private int mDePala;

    public Excavadora(String nombre, int caballos, int mDePala) {
        super(nombre, caballos);
        this.mDePala = mDePala;
    }

}