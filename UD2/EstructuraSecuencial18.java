import java.util.Scanner;

public class EstructuraSecuencial18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, apellido1, apellido2;
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido");
		apellido1 = sc.nextLine();
		System.out.println("Introduce tu segundo apellido");
		apellido2 = sc.nextLine();
		System.out.println("Tus iniciales son: " + nombre.charAt(0) + ". "
				+ apellido1.charAt(0) + ". " + apellido2.charAt(0) + ".");

	}
}