import java.util.Scanner;

public class EstructuraSecuencial12 {
	public static void main(String[] args) {
		// declaramos variables
		double x1, x2, y1, y2, distancia;
		Scanner sc = new Scanner(System.in);
		// pedimos valores y los inicializamos
		System.out.println("Valor x1: ");
		x1 = sc.nextInt();
		System.out.println("Valor y1: ");
		y1 = sc.nextInt();
		System.out.println("Valor x2: ");
		x2 = sc.nextInt();
		System.out.println("Valor y2: ");
		y2 = sc.nextInt();
		// operamos
		distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		// System.out.printf("Punto 1: %d %d Punto 2: %d %d ", x1,y1,x2,y2);
		System.out.printf("\n distancia entre %.2f , %.2f  y %.2f , %.2f es %.2f ", x1, x2, y1, y2, distancia);
	}
}