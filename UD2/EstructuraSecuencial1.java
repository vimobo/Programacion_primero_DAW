import java.util.Scanner;
//imporatmos la clase creando un objeto Scanner

public class EstructuraSecuencial1 {

	public static void main(String[] args) {

		// creamos un objeto Scanner
		Scanner pregunta = new Scanner(System.in);

		// Declaramos una variable string y le asignamos la respuesta como valor.
		System.out.println("hola escribe tu nombre:");
		String nombre = pregunta.nextLine();
		System.out.println("Tu nombre es: " + nombre);

	}
}