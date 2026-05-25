import java.util.Scanner;

public class LetrasIniciales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido1, apellido2;
		System.out.println("introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("introduce tu nombre");
		apellido1 = sc.nextLine();
		System.out.println("introduce tu nombre");
		apellido2 = sc.nextLine();
		nombre = nombre.toUpperCase();
		System.out
				.println("tus inicales son" + nombre.charAt(0) + " " + apellido1.charAt(0) + " " + apellido2.charAt(0));

	}
}