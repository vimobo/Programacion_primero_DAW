import java.util.Scanner;

public class EstructuraSecuencial11 {
	public static void main(String[] args) {
		// declaramos variables
		int a;
		int b;
		int valorAbsoluto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor a: ");
		a = sc.nextInt();
		System.out.println("Valor b: ");
		b = sc.nextInt();
		valorAbsoluto = Math.abs(a - b);
		System.out.println("Distancia en valor absoluto: " + valorAbsoluto);
	}
}