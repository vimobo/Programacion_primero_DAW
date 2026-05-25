import java.util.Scanner;

public class EstructuraSecuencial5 {

	public static void main(String[] args) {

		float c;
		float f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce grados en Fº");
		f = sc.nextFloat();
		c = (f - 32) * 5 / 9;
		System.out.printf("%.2f  grados Fº son %.2f grados Cº", f, c);
	}
}