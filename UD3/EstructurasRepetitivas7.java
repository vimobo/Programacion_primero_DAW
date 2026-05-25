import java.util.Scanner;

public class EstructurasRepetitivas7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, i;

        System.out.println("introduce un numero para saber la tabla de multiplicar");
        numero = sc.nextInt();
        System.out.println("******************************************************");
        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}