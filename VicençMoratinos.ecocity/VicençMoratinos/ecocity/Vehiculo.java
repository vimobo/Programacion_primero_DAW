package ecocity;

public class Vehiculo implements Alquilable {

	// atributos
	protected int idVehiculo;
	protected String marca;
	protected double tarifaBaseDiaria;

	// constructor
	public Vehiculo(int idVehiculo, String marca, double tarifaBaseDiaria) {
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.tarifaBaseDiaria = tarifaBaseDiaria;
	}

	// métodos
	// este se sobreescribe porque es heredado de object.
	@Override
	public String toString() {
		return "ID Vehiculo: " + idVehiculo +
				"\nMarca: " + marca +
				"\nTarifa Base Diaria: " + tarifaBaseDiaria;
	}

	@Override
	public double calcularCosteAlquiler(int dias) {
		return dias * tarifaBaseDiaria;
	}
}