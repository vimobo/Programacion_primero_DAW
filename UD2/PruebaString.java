import java.util.Scanner;

public class PruebaString {

	public static void main(String[] args) {
		// programa para invertir los valores

		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("introduce un numero de 2 cifras");
		x = sc.nextInt();
		String cad1 = String.valueOf(x);
		String cad2 = cad1.substring(0, 1);
		String cad3 = cad1.substring(1, 2);

		// String cad2
		System.out.println(cad3 + cad2);

	}
}