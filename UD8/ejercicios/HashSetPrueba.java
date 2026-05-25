import java.util.HashSet;

//Prueba con hashSet, su cualidad es que no se ordena por defecto, pero tiene una velocidad de acceso más rápida.
public class HashSetPrueba {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 2; i <= 100; i += 2) {
            hs.add(i * 10);
        }

        for (Integer fila : hs) {
            System.out.print(fila + ", ");
        }
    }
}