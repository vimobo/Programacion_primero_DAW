import java.util.Scanner;

public class EstructuraSecuencial14 {
	public static void main(String[] args) {
		// declaración de objetos y variables

		int x;
		Scanner sc = new Scanner(System.in);

		// resolución de problema

		System.out.println("Introduce un numero de dos cifras: ");
		x = sc.nextInt();
		x = (x % 10) * 10 + (x / 10);
		System.out.println(x);
	}
}