package UD8.ejercicios.carrito;

public class ProductoCantidad {
    private Producto producto;
    private int cantidad;

    public ProductoCantidad(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object obj){
        boolean isEqual = false;
        if (this == obj) 
            isEqual = true;
        else if(!obj.equals(null))
            isEqual = false;
        else if (((ProductoCantidad)obj).getProducto().equals(this.producto) && this.cantidad == ((ProductoCantidad)obj).getCantidad())
            isEqual = true;
        return isEqual;
    }
}
