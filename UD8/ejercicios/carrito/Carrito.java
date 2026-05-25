import java.util.Iterator;
import java.util.LinkedList;

public class Carrito {

    private LinkedList<ProductoCantidad> carrito;

    public Carrito() {
        this.carrito = new LinkedList<>();
    }

    public String toString() {
        String cad = "";
        for (ProductoCantidad pC : carrito) {
            cad += pC.toString();
        }
        cad += "\nPrecio Total: " + this.calcularPrecio() + "\n-------------------------";
        return cad;
    }

    public double calcularPrecio() {
        double total = 0;
        for (ProductoCantidad pC : carrito) {
            total += (pC.getProducto().getPrecio() * pC.getCantidad());
        }
        return total;
    }

    /*
     * public void limpiarCarrito(){
     * this.limpiarVacio();
     * this.limpiarPrecioNegativo();
     * this.limpiarExp();
     * }
     * 
     * public void limpiarVacio(){
     * ProductoCantidad pcRemove = null;
     * for(ProductoCantidad pC: carrito) {
     * if (pC.getCantidad() <= 0) {
     * pcRemove = pC;
     * }
     * }
     * if (pcRemove != null) {
     * carrito.remove(pcRemove);
     * }
     * }
     * 
     * public void limpiarPrecioNegativo(){
     * for(ProductoCantidad pC: carrito) {
     * if (pC.getProducto() != null && pC.getProducto().getPrecio() <= 0) {
     * }
     * carrito.remove(pC);
     * }
     * }
     * 
     * public void limpiarExp() {
     * for(ProductoCantidad pC: carrito) {
     * String regex = "^[E][X][P]";
     * if (pC.getProducto() != null && pC.getProducto().getNombre().matches(regex))
     * {
     * carrito.remove(pC);
     * }
     * }
     * }
     */

    public void limpiarCarrito() {
        Iterator<ProductoCantidad> it = carrito.iterator();
        String regex = ;

        if (carrito != null) {
            while (it.hasNext()) {
                ProductoCantidad pC = (ProductoCantidad) it.next();
                if (pC.getProducto().getNombre().matches("^EXP") ||
                        pC.getCantidad() <= 0 ||
                        pC.getProducto().getPrecio() <= 0) {
                    it.remove();
                    System.out.println("Producto eliminado: " + pC.getProducto().getNombre());
                }
            }
        }
    }

    public static void main(String[] args) {

        Carrito carritoObj = new Carrito();

        Producto p1 = new Producto("P001", "Teclado Mecánico", 45.50, 12);
        Producto p2 = new Producto("P002", "Ratón Gaming", 15.0, 5);
        Producto p3 = new Producto("P003", "EXP-DESCUENTO10", -10.0, 1);
        Producto p4 = new Producto("P004", "Monitor 4K", 350.00, 0);
        Producto p5 = new Producto("P005", "Alfombrilla XL", 0.0, 20);
        carritoObj.carrito.add(new ProductoCantidad(p1, 12));
        carritoObj.carrito.add(new ProductoCantidad(p2, 5));
        carritoObj.carrito.add(new ProductoCantidad(p3, 1));
        carritoObj.carrito.add(new ProductoCantidad(p4, 0));
        carritoObj.carrito.add(new ProductoCantidad(p5, 20));

        System.out.println(carritoObj.toString());

        // carritoObj.limpiarCarrito();
        // carritoObj.limpiarVacio();
        // carritoObj.limpiarPrecioNegativo();
        carritoObj.limpiarCarrito();

        System.out.println(carritoObj.toString());
    }
}
