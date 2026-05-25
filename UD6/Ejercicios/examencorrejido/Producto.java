
public class Producto {

    // att
    private String nombre;
    private String marca;
    private String fechaReg;

    // metodos
    public Producto(String nombre, String marca, String fechaReg) throws Exception {
        if (Producto.validarFecha(fechaReg)) {
            this.nombre = nombre;
            this.marca = marca;
            this.fechaReg = fechaReg;
        } else {
            throw new Exception("formato incorrecto");
        }
    }

    public static boolean validarFecha(String fechaReg) {
        String regex = "(3[01]|[12][0-9]|0?[1-9])/(1[0-2]|0?[1-9])/\\d{4}";
        return fechaReg.matches(regex);
    }

    public static void main(String[] args) {
        try {
            Producto p = new Producto("vic", "yamaha", "40/04/2000");
        } catch (Exception e) {
            System.out.println("Error al crear el producto: " + e.getMessage());
        }
    }

}