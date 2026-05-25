import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Collections;

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

    public String toStringReverse() {

        ListIterator<ProductoCantidad> it = carrito.listIterator(carrito.size());
        String cad = "";
        
        while (it.hasPrevious()) {
            ProductoCantidad pC = it.previous();
            cad += pC.toString();
        }
        cad += "\nPrecio Total: " + this.calcularPrecio() + "\n-------------------------";
        return cad;
    }

    
    public void ordenarCarrito() {
        Collections.sort(carrito);
    }

    public double calcularPrecio() {
        double total = 0;
        for (ProductoCantidad pC : carrito) {
            total += (pC.getProducto().getPrecio() * pC.getCantidad());
        }
        return total;
    }

    public void limpiarCarrito() {
        ListIterator<ProductoCantidad> it = carrito.listIterator();

        if (carrito != null) {
            while (it.hasNext()) {
                ProductoCantidad pC =  it.next();
                if (pC.getProducto().getNombre().contains("DESCUENTO")) {
                    it.add(new ProductoCantidad(new Producto("F10", "Funda de Regalo", 0.0, 1), 10));
                }
                else if (pC.getProducto().getNombre().matches("^EXP") ||
                        pC.getProducto().getPrecio() <= 0) {
                    it.remove();
                    System.out.println("Producto eliminado: " + pC.getProducto().getNombre());
                }
                        
                else if (pC.getCantidad() <= 0) {
                    it.set(new ProductoCantidad(new Producto("xxx", "Tarjeta regalo", 0, 100), 1));
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

        System.out.println(carritoObj.toStringReverse());

        

        carritoObj.ordenarCarrito();
        System.out.println(carritoObj.toString());

    }
}
