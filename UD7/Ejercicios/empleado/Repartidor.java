public class Repartidor extends Empleado {

    // att
    private int entregasRealizadas;
    private final double PAGOPORENTREGA = 5;

    // constructor
    public Repartidor(String nombre, double salarioBase, int entregasRealizadas) {
        super(nombre, salarioBase);
        this.entregasRealizadas = entregasRealizadas;
    }

    // metodods
    @Override
    public double calcularSueldo() {
        return salarioBase + (entregasRealizadas * PAGOPORENTREGA);
    }
}