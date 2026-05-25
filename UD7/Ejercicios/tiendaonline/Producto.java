public class Producto {

    // atributos
    private static int cuentaId;
    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;

    // constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

        id = cuentaId;
        cuentaId++;
    }

    // metodos
    public String toString() {
        return "---------------------" +
                "\nId:" + id +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio + " €" +
                "\nStock: " + stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad >= 0)
            stock += cantidad;
    }

    public boolean reducirStock(int cantidad) {
        boolean hayStock = false;

        if ((stock - cantidad) >= 0) {
            stock -= cantidad;
            hayStock = true;
        }

        return hayStock;
    }
}