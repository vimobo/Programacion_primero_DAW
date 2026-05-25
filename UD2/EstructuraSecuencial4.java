import java.util.Scanner;

public class EstructuraSecuencial4 {
	public static void main(String[] args) {
		// creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		// creamos las variables
		int x;
		int y;
		// les asignamos un valor con scanner y nextInt
		System.out.println("Introduce x");
		x = sc.nextInt();
		System.out.println("Introduce y");
		y = sc.nextInt();
		// Calculamos y imprimimos por pantalla
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("El resto de x / y es " + (x % y));
	}
}