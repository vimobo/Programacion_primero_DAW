package ecocity;

public class GestorEcoCity {
	public static void main(String[] args) {

		// Aqui probaremos que funciona todo correctamente
		final int N_VEHICULOS = 5;
		int diasAlquiler = 7;

		// creamos el array estático
		Vehiculo[] arrayVehiculos = new Vehiculo[N_VEHICULOS];

		// instanciamos los objetos de las clases coche y bici
		CocheElectrico ce1 = new CocheElectrico(1, "Seat", 150.0, 100);
		CocheElectrico ce2 = new CocheElectrico(2, "Tesla", 200.0, 100);
		BiciElectrica be1 = new BiciElectrica(3, "Trek", 50.0, true);
		BiciElectrica be2 = new BiciElectrica(4, "Mondraker", 50.0, false);

		// llenamos el array
		arrayVehiculos[0] = ce1;
		arrayVehiculos[1] = ce2;
		arrayVehiculos[2] = be1;
		arrayVehiculos[3] = be2;

		// bucle para imprimir por pantalla;

		System.out.println("************** INFORME **************");

		for (int i = 0; i < arrayVehiculos.length; i++) {
			if (arrayVehiculos[i] != null) {
				System.out.println(arrayVehiculos[i]);
				System.out.println("El coste de alquilar " + diasAlquiler +
						" dias es " + arrayVehiculos[i].calcularCosteAlquiler(diasAlquiler));
				System.out.println("************************************");

			}
		}

	}
}