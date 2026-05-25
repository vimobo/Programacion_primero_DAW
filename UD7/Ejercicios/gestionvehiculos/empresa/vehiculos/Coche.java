package empresa.vehiculos;

import empresa.interfaces.*;
import java.util.GregorianCalendar;

public class Coche extends Vehiculo implements Conducible {

    private double consumo;

    public Coche(String matricula, int kmTotales, GregorianCalendar fechaRegistro, double consumo) {
        super(matricula, kmTotales, fechaRegistro);
        this.consumo = consumo;
    }

    @Override
    public double calcularCoste() {
        return kmTotales * (consumo / 100);
    }

    @Override
    public void conducir(int km) throws Exception {

        if (km < 0) {
            throw new Exception("No se puede negativo");
        }
        kmTotales += km;
    }
}