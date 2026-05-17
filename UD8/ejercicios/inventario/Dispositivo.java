public abstract class Dispositivo {

    private String nombre;
    private String marca;
    private double precio;
    private int stock;

    public Dispositivo (String nombre, String marca, double precio, int stock) {
        this.nombre = nombre; 
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nMarca: " + marca + "\nPrecio: " + precio + "\nStock: " + stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}