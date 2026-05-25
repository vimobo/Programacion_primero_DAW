import java.util.Scanner;

public class PruebaEspecificaUd2 {

	public static void main(String[] args) {

		// Creamos variables y objeto scanner
		int numeroDni;
		char letraDni;
		String nombre;
		String estado;
		double altura;
		double peso;
		int imc;
		Scanner sc = new Scanner(System.in);

		// pedimos los datos
		System.out.print("\nIntroduce tu nombre (Hasta 10 caracteres): ");
		nombre = sc.nextLine();
		System.out.print("\nIntroduce el numero de tu DNI (8 numeros): ");
		numeroDni = Integer.parseInt(sc.nextLine());
		System.out.print("\nIntroduce la letra del DNI: ");
		letraDni = sc.nextLine().charAt(0);
		System.out.print("\nIntroduce tu altura: ");
		altura = Double.parseDouble(sc.nextLine());
		System.out.print("\nIntroduce tu peso: ");
		peso = Double.parseDouble(sc.nextLine());

		// calculamos el imc
		imc = (int) (peso / (altura * altura));
		estado = (imc <= 25) ? ((imc <= 18) ? "Bajo peso" : "Normal") : ((imc >= 30) ? "Obesidad" : "Sobrepeso");
		// imprimimos resultados
		System.out.println("\nCalculadora de Índice de Masa Corporal (IMC) \n");
		System.out.printf("*********************************************\n");
		System.out.printf("* Nombre: %s    * DNI: %d%c        *\n", nombre, numeroDni, letraDni);
		System.out.printf("*********************************************\n");
		System.out.printf("* IMAC: %d           * ESTADO: %s     *\n", imc, estado);
		System.out.printf("*********************************************\n");

	}
}
