public class Pedido {

    // att
    private static int cuentaId;
    protected int id;
    protected EstadoPedido estado;
    protected Producto[] productos;
    protected double total;
    private int contadorProductos;

    // constructor

    public Pedido() {
        id = cuentaId;
        cuentaId++;

        estado = EstadoPedido.CREADO;
        total = 0;
        productos = new Producto[5];
    }

    // metodos
    public boolean aniadirProducto(Producto p) {
        boolean seHaAniadido = false;

        if (p != null) {

            if (contadorProductos < productos.length) {
                productos[contadorProductos] = p;
                seHaAniadido = true;
                contadorProductos++;
            }
        }
        return seHaAniadido;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                total += productos[i].precio;
            }
        }
        return total;
    }

    public void pagar(MetodoPago mp) {

        estado = EstadoPedido.PAGADO;
        mp.pagar(this.calcularTotal());
        System.out.println("Has pagado " + this.calcularTotal() + " con " + mp.getClass());
    }

    public String mostrarPedido() {
        String cad = "Cuenta Id: " + cuentaId +
                "\nID: " + id +
                "\nEdado: " + estado;

        for (int i = 0; i < contadorProductos; i++) {
            cad += productos[i].toString();
        }

        cad += "\nTotal: " + this.calcularTotal();

        return cad;
    }
}