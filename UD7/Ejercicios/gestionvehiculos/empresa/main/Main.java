package empresa.main;

import java.util.GregorianCalendar;
import empresa.interfaces.Conducible;
import empresa.vehiculos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String fecha = "";
        String regEx = "^[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$";
        System.out.println("Hola introduce fecha aaaa/mm/dd");

        do {
            fecha = "1000/10/10";
            // sc.nextLine();
            if (!fecha.matches(regEx))
                System.out.println("Introduce formato correcto");
        } while (!fecha.matches(regEx));

        GregorianCalendar fechaFormateada = new GregorianCalendar(Integer.parseInt(fecha.substring(0, 4)),
                Integer.parseInt(fecha.substring(5, 7)) - 1, Integer.parseInt(fecha.substring(8, 10)));

        try {
            Vehiculo[] array = new Vehiculo[3];

            Camion cm = new Camion("KPMM123", 200, fechaFormateada, 20);
            Coche co = new Coche("KSJ1234", -20, fechaFormateada, 20);
            array[0] = cm;
            array[1] = co;

            co.conducir(20);
            System.out.println(cm);

            ((Coche) array[1]).conducir(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}