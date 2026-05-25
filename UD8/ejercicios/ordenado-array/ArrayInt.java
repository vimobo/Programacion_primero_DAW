import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayInt {
    public static void main (String[]args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            lista.add((int)(Math.random()*(100+1)));
        }
        System.out.println(lista);

        ListIterator it = lista.listIterator();

        

        lista.sort(null);
        System.out.println(lista);

    }
}
