import java.util.ArrayList;

public class PruebaList {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            lista.add(i);
        }

        int buscado = 13;
        int nuevo = 100;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == buscado) {
                lista.set(i, nuevo);
            }
        }
        System.out.println(lista);
    }
}