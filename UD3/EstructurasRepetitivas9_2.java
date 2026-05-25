public class EstructurasRepetitivas9_2 {

    static void tablaMultiplicar(int x) {
        int i2;
        for (i2 = 1; i2 <= 10; i2++) {
            System.out.println(i2 + " x " + x + " = " + (i2 * x));
        }
    }

    public static void main(String[] args) {

        int i;

        for (i = 1; i <= 5; i++) {
            System.out.printf("\nTabla del %d\n", i);
            tablaMultiplicar(i);
        }
    }
}