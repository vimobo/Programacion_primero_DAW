import java.util.Scanner;

public class EstructuraSecuencial6 {

	public static void main(String[] args) {

		// declaramos variables
		float x;
		float y = 0;
		// float y;
		// objeto scanner
		Scanner sc = new Scanner(System.in);
		// asignamos valor con nextfloat
		System.out.println("Introduce 1r valor");
		x = sc.nextFloat();
		y = x + y;
		System.out.println("Introduce 2º valor");
		x = sc.nextFloat();
		y = x + y;
		System.out.println("Introduce 3r valor");
		x = sc.nextFloat();
		y = x + y;
		// imprimimos por pantalla
		System.out.println("la media de los tres valores = " + (y / 3));
	}

}
