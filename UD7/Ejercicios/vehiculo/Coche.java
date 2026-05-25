public class Coche extends Vehiculo {

    private int cilindrada;
    private int kmParciales;
    public static final int KMREVISION = 15000;

    public Coche(int kmParciales, int kmRecorridos, int cilindrada) {

        super(kmRecorridos);
        this.cilindrada = cilindrada;
        this.kmParciales = kmParciales;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getKmParciales() {
        return kmParciales;
    }

    public void setKmParciales(int kmParciales) {
        this.kmParciales = kmParciales;
    }

    public int saberKmRevision() {
        return kmParciales % KMREVISION;
    }

    public void resetearRevision() {
        kmParciales = 0;
    }

    public String toString() {
        return "\n***********" +
                "|nKm recorridos: " + this.getKmRecorridos() +
                "\nkm parciales: " + kmParciales +
                "\ncilindrada: " + cilindrada +
                "\n***********";
    }
}