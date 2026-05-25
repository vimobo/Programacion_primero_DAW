public class Vehiculo {

    private int kmRecorridos;
    private static int kmTotales;
    private static int vehiculosCreados;

    public Vehiculo(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
        vehiculosCreados++;
    }

    public static int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        Vehiculo.kmTotales = kmTotales;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public static int getVehiculosCreados() {
        return Vehiculo.vehiculosCreados;
    }

    public void recorrer(int distancia) {
        kmRecorridos += distancia;
        Vehiculo.kmTotales += distancia;
    }
}