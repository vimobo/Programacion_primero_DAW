import java.util.Scanner;

public class EstructuraSecuencial7 {

	public static void main(String[] args) {

		int minutos;
		int minutosRestantes;
		int horas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los minutos");
		minutos = sc.nextInt();
		horas = minutos / 60;
		minutosRestantes = minutos % 60;
		System.out.printf("%d son %d horas y %d minutos", minutos, horas, minutosRestantes);

	}
}