package UD8.ejercicios.carrito;
import java.util.LinkedList;

public class Carrito {

    private LinkedList<ProductoCantidad> carrito;

    public Carrito () {
        this.carrito = new LinkedList<>();
    }
    
    public static void main(String[]args) {
        Carrito carritoObj = new Carrito();

        carritoObj.carrito.add(new ProductoCantidad(new Producto("P001","Teclado Mecánico", 45.50, 12), 3));
    }
}
