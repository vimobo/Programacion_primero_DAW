package trabajo_cadenas;

public class TrabajoCadenas {

    public static StringBuilder concatenarCadenas(String cad1, String cad2) {

        StringBuilder cadConcat = new StringBuilder();
        cadConcat.append(cad1);
        cadConcat.append(cad2);
        return cadConcat;
    }

    public static char[] cadenaAArray(String frase) {

        char[] array = frase.toCharArray();

        return array;
    }

    public static int[] crearArray(int x) {
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        return array;
    }

    public static String convierteArrayEnString(int[] a) {
        String cad = "";

        for (int i = 0; i < a.length; i++) {
            cad += a[i];
        }

        return cad;
    }
}