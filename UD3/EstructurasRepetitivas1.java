import java.util.Scanner;

public class EstructurasRepetitivas1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorial, x, i;
        System.out.println("introduce un numero factorial");
        factorial = sc.nextInt();
        x = factorial;
        for (i = x - 1; i >= 2; i--) {
            factorial = factorial * i;
            System.out.println(factorial);

        }
        System.out.println(factorial);
    }
}