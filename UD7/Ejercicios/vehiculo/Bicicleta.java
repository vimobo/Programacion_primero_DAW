public class Bicicleta extends Vehiculo {

    private int pinones;
    private int kmParciales;

    public Bicicleta(int kmParciales, int kmRecorridos, int pinones) {
        super(kmRecorridos);
        this.pinones = pinones;
    }

    public int getPinones() {
        return pinones;
    }

    public int getKmParciales() {
        return kmParciales;
    }

    public void cambiarPinones(int nPinones) {
        pinones = nPinones;
        kmParciales = 0;
    }

    @Override
    public void recorrer(int distancia) {
        super.recorrer(distancia);
        kmParciales += distancia;
    }

    public String toString() {
        return "\n***********" +
                "\nKm recorridos: " + this.getKmRecorridos() +
                "\nkm parciales: " + kmParciales +
                "\npiñones + " + pinones +
                "\n***********";
    }
}
