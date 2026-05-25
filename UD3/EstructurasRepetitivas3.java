import java.util.Scanner;

public class EstructurasRepetitivas3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num, sum = 0;
        int i = -1;
        System.out.println("Introduce un numero");
        num = sc.nextInt();

        while (num != 0) {

            System.out.println("Introduce un numero");
            num = sc.nextDouble();
            sum += num;
            i++;

        }
        System.out.println("la media es " + (sum / i));
    }
}