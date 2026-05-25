import java.util.Scanner;

public class EstructuraSecuencial17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora, minutos, segundos, segundos2, minutos2, horas2;
		String horas, h, m, s;
		System.out.println("introduce la hora de salida con este formato: \"hh:mm:ss\"");
		horas = sc.nextLine();
		System.out.println("introduce el tiempo de viaje en segundos: ");
		segundos2 = sc.nextInt();
		h = horas.substring(0, 2);
		m = horas.substring(3, 5);
		s = horas.substring(6, 8);
		hora = Integer.parseInt(h);
		minutos = Integer.parseInt(m);
		segundos = Integer.parseInt(s);
		segundos2 += (hora * 3600) + (minutos * 60) + segundos;
		minutos2 = (segundos2 % 3600) / 60;
		horas2 = segundos2 / 3600;
		segundos2 = segundos2 % 60;

		System.out.printf("\n%d : %d : %d \n", horas2, minutos2, segundos2);
		System.out.println("llegaras a las " + horas2 + ":" + minutos2 + ":" + segundos);

	}
}