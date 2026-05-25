package ficha_personal;

import ficha_personal.*;
import fecha.*;
import java.util.Scanner;

public class FichaTest {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        String fecha = "";

        // bucle para el formato
        do {

            System.out.print("Introduce la fehca de nacimiento tuya en formato XX/XX/XXXX: ");
            fecha = sc.nextLine();

            if (!fecha.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$"))
                System.out.println("Introduce bien el formato");

        } while (!fecha.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$"));
        int dia = Integer.parseInt(fecha.substring(0, 2));

        // convertir de numero a mes

        EnumMes mes = EnumMes.values()[Integer.parseInt(fecha.substring(3, 5)) - 1];
        int anio = Integer.parseInt(fecha.substring(6, 10));
        Fecha fechaNac = new Fecha(dia, mes, anio);
        System.out.println("Fecha nacimiento: " + fechaNac.toString());

    }
}