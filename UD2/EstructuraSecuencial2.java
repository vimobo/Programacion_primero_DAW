import java.util.Scanner;

public class EstructuraSecuencial2 {

	public static void main(String[] args) {
		// Creamos el objeto scaner
		Scanner scanA = new Scanner(System.in);
		Scanner scanb = new Scanner(System.in);
		// llenamos las variables con el objeto scaner
		System.out.println("pon A");
		int ladoA = scanA.nextInt();
		System.out.println("lado B");
		int ladoB = scanb.nextInt();
		// calculamos el area
		System.out.println("el área es " + ladoA * ladoB);
		System.out.println("el perimetro es " + (ladoA * 2 + ladoB * 2));
	}
}