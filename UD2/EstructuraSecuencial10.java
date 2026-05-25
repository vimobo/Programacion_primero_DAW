import java.util.Scanner;

public class EstructuraSecuencial10 {

	public static void main(String[] args) {

		// declaramos las variables
		double notaA;
		double notaB;
		double notaC;
		double examen;
		double trabajo;
		double parciales;
		// creamos objeto scanner
		Scanner sc = new Scanner(System.in);
		// inicializamos las variables
		System.out.println("Introduce tu primera nota");
		notaA = sc.nextDouble();
		System.out.println("Introduce tu segunda nota");
		notaB = sc.nextDouble();
		System.out.println("Introduce tu tercera nota");
		notaC = sc.nextDouble();
		System.out.println("Introduce tu nota del examen");
		examen = sc.nextDouble();
		System.out.println("Introduce nota del trabajo");
		trabajo = sc.nextDouble();
		// calculamos y imprimimos
		examen *= 0.3;
		trabajo *= 0.15;
		parciales = ((notaA + notaB + notaC) / 3) * 0.55;
		System.out.println("Parciales: " + parciales);
		System.out.println("Examen final: " + examen);
		System.out.println("Trabajo final: " + trabajo);
		System.out.println("Tu nota: " + (examen + parciales + trabajo));
	}
}