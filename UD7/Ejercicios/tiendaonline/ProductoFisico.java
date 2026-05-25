public class ProductoFisico extends Producto {

    // atributos
    private double peso;
    private double costeEnvioXKm;

    // constructor
    public ProductoFisico(double peso, double costeEnvioXKm, String nombre, double precio) {
        super(nombre, precio);
        this.peso = peso;
        this.costeEnvioXKm = costeEnvioXKm;
    }

    // metodos
    public double calcularEnvio(int km) {
        return km * costeEnvioXKm;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\nPeso: " + peso + " kg" +
                "\nCoste de Envio por Km: " + costeEnvioXKm + " €";
    }
}