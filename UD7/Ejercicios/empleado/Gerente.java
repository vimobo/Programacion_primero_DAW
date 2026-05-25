public class Gerente extends Empleado {

    // att
    private double bono;

    // constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono;
    }
}