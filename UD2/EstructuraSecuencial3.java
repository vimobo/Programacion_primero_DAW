import java.util.Scanner;

public class EstructuraSecuencial3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hipotenusa;
		System.out.println("Dime el cateto A");
		double catetoA = sc.nextDouble();
		System.out.println("Dime el cateto B");
		double catetoB = sc.nextDouble();
		hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		System.out.println("la hipotenusa es " + hipotenusa);

	}

}