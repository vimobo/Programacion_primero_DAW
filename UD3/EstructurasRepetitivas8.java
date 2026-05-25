import java.util.Scanner;

public class EstructurasRepetitivas8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int i;
        double num2;
        double resultado = 0;

        System.out.println("Introduce un numero real");
        num2 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce un numero entero para potencia");
        num1 = sc.nextInt();

        resultado = num2;
        for (i = 1; i != num1; i++) {
            resultado *= num2;

        }

        System.out.printf("\n%f ^ %d = %f", num2, num1, resultado);

    }
}