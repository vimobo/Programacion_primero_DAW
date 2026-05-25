package empresa.vehiculos;

import empresa.interfaces.*;
import java.util.GregorianCalendar;

public class Camion extends Vehiculo {

    private double cargaComercial;

    public Camion(String matricula, int kmTotales, GregorianCalendar fechaRegistro, double cargaComercial) {
        super(matricula, kmTotales, fechaRegistro);
        this.cargaComercial = cargaComercial;
    }

    @Override
    public double calcularCoste() {
        return kmTotales + cargaComercial;
    }

    public void aumentarKm(int km) {
        kmTotales += km;
    }
}