import java.util.Scanner;

public class EstructuraSecuencial13 {

	public static void main (String[]args){
	
	
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		double  x,  raizCuadradaX, raizCubicaX;
		
		//resolución
		System.out.println("Introduce x:");
		x = sc.nextDouble();
		raizCuadradaX = Math.sqrt(x);
		raizCubicaX = Math.pow(x, 1.0/3 //hay que poner un 1.0 para que almenos uno de los dos sea un double
		System.out.println("La raiz cuadrada de " + x + " es "
		+ raizCuadradaX + " y la raíz cubica es "+ raizCubicaX );
		System.out.println(TERCIO);
	}
}