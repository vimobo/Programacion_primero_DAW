public abstract class Empleado {

    // att
    protected String nombre;
    protected double salarioBase;

    // constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // metodos
    public double calcularSueldo() {
        return salarioBase;
    }
}