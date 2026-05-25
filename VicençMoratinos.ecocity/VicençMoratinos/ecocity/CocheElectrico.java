package ecocity;

public class CocheElectrico extends Vehiculo {

	// att
	private int nivelBateria;

	// constructor usando el constructor del padre
	public CocheElectrico(int idVehiculo, String marca, double tarifaBaseDiaria, int nivelBateria) {
		super(idVehiculo, marca, tarifaBaseDiaria);
		this.nivelBateria = nivelBateria;
	}

	// métodos
	@Override
	public String toString() {
		return super.toString() +
				"\nNivel de Bateria: " + nivelBateria + "%";
	}

	// calculamos el alquiler aplicando descuento cuando super 5 dias.
	@Override
	public double calcularCosteAlquiler(int dias) {
		double total = dias * tarifaBaseDiaria;

		if (dias >= 5)
			total *= 0.9;

		return total;
	}

}