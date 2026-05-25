package empresa.vehiculos;

import java.util.GregorianCalendar;

public abstract class Vehiculo {

    // att
    protected String matricula;
    protected int kmTotales;
    protected GregorianCalendar fechaRegistro;

    // constructor
    public Vehiculo(String matricula, int kmTotales, GregorianCalendar fechaRegistro) {
        this.matricula = matricula;
        this.kmTotales = kmTotales;
        this.fechaRegistro = fechaRegistro;
    }

    // métodos
    public double calcularCoste() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nmatricula: " + matricula +
                "\nkmTotales: " + kmTotales +
                "\nfechaRegistro: " + fechaRegistro.get(fechaRegistro.YEAR) + "/"
                + fechaRegistro.get(fechaRegistro.MONTH) + "/" + fechaRegistro.get(fechaRegistro.DAY_OF_MONTH);
    }
}
