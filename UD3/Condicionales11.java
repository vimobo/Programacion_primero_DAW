import java.util.Scanner;

public class Condicionales11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anyo;
        boolean bisiesto;

        System.out.println("Introduce un año");
        anyo = sc.nextInt();

        if ((anyo % 400) == 0) {
            bisiesto = true;
        } else {
            if ((anyo % 100) == 0) {
                bisiesto = false;
            } else {
                if ((anyo % 4) == 0) {
                    bisiesto = true;
                } else {
                    bisiesto = false;
                }
            }
        }
        System.out.println("Es bisiesto? " + bisiesto);
    }

}