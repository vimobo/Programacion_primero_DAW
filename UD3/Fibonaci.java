
public class Fibonaci {

    public static void main(String[] args) {

        int a = 0, b = 1, c, i;

        for (i = 0; i < 10; i++) {
            c = a + b;
            System.out.println(c);
            a = c + b;
            System.out.println(a);
            b = c + a;
            System.out.println(b);

        }
    }
}