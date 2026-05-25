import java.util.Scanner;

public class Condicionales9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduce A");
        a = sc.nextInt();
        System.out.println("Introduce B");
        b = sc.nextInt();
        System.out.println("Introduce C");
        c = sc.nextInt();

        if (a >= b && b >= c) {
            System.out.printf("%d  %d  %d\n", a, b, c);
        } else {
            if (a >= c && c >= b) {
                System.out.printf("%d  %d  %d\n", a, c, b);
            } else {
                if (c >= b && b >= a) {
                    System.out.printf("%d  %d  %d\n", c, b, a);
                } else {
                    System.out.printf("%d  %d  %d\n", c, a, b);
                }
            }
        }
    }
}