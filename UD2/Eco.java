import java.util.Scanner;

//importamos el paquete scanner

public class Eco {

	public static void main(String[] args) {
		String palabra;
		// creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		// pedimos al usuario que introduzca una palabra
		palabra = sc.nextLine();
		System.out.println("Tu palabra es = " + palabra);
	}
}