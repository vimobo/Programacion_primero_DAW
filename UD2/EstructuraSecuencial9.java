import java.util.Scanner;

public class EstructuraSecuencial9 {

	public static void main(String[] args) {
		// declaramos variables
		double precio;
		double precioDescuento;
		// creamos objeto scanner y inicializamos la variable
		Scanner sc = new Scanner(System.in);
		System.out.println("precio entero");
		precio = sc.nextDouble();
		// calculamos el precio
		precioDescuento = precio * 0.85;
		System.out.println("precio con descuento: " + precioDescuento);
	}
}
