import java.util.Scanner;

public class EstructuraSecuencial8 {
	public static void main(String[] args) {
		// declaración de objetos y variables
		int venta1, venta2, venta3, sueldoBase;
		double totalComision, sueldoFinal;
		final double COMISION = 0.1;
		Scanner sc = new Scanner(System.in);

		// resolución de problema
		System.out.println("Introduce el sueldo base");
		sueldoBase = sc.nextInt();
		System.out.println("Introduce la primera venta");
		venta1 = sc.nextInt();
		System.out.println("Introduce la segunda venta");
		venta2 = sc.nextInt();
		System.out.println("Introduce la tercera venta");
		venta3 = sc.nextInt();
		totalComision = (venta1 + venta2 + venta3) * COMISION;
		sueldoFinal = totalComision + sueldoBase;
		System.out.println("Tu sueldo base es: " + sueldoBase);
		System.out.println("Tus comisiones són: " + totalComision);
		System.out.println("El sueldo final es: " + sueldoFinal);
	}
}