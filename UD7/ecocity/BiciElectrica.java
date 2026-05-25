package ecocity;

public class BiciElectrica extends Vehiculo {

	// att
	private boolean incluyeCasco;

	// constructor
	public BiciElectrica(int idVehiculo, String marca, double tarifaBaseDiaria, boolean incluyeCasco) {
		super(idVehiculo, marca, tarifaBaseDiaria);
		this.incluyeCasco = incluyeCasco;
	}

	// métodos
	@Override
	public String toString() {
		String cad = super.toString() +
				"\nCasco Incluido: ";
		if (incluyeCasco)
			cad += "si";
		else
			cad += "no";
		return cad;
	}

	// calculamos el alquiler
	@Override
	public double calcularCosteAlquiler(int dias) {
		final int COSTE_DIARIO_CASCO = 2;

		if (incluyeCasco)
			tarifaBaseDiaria += COSTE_DIARIO_CASCO;

		return dias * tarifaBaseDiaria;
	}
}