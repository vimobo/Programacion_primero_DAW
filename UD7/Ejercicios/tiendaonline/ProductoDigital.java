public class ProductoDigital extends Producto {

    private double tamanioArchivo;

    public ProductoDigital(String nombre, double precio, double tamanioArchivo) {
        super(nombre, precio);
        this.tamanioArchivo = tamanioArchivo;
    }

    public double descargar() {
        return tamanioArchivo;
    }
}