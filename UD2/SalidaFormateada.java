public class SalidaFormateada {
	public static void main(String[] args) {
		// le indicamos el formato de la salida de datos.
		System.out.printf("El numero %d no tiene decimales. \n", 21);
		System.out.printf("El numero %f sale con decimales. \n", 21.0);
		System.out.printf("El %.3f sale exactamente con 3 decimales. \n", 21.0);

	}
}