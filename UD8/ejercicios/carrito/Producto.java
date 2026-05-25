
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    @Override
    public boolean equals(Object obj) {
        Producto p = (Producto) obj;
        boolean equals = false;
        if (this.getNombre().equals(p.getNombre()) &&
                this.getId().equals(p.getId()) &&
                this.getPrecio() == p.getPrecio() &&
                this.getStock() == p.getStock())
            equals = true;
        return equals;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nnombre: " + nombre + "\nprecio: " + precio + "\nstock: " + stock;
    }
}
