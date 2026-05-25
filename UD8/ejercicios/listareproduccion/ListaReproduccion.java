import java.util.ArrayList;
import java.util.LinkedList;

public class ListaReproduccion {
    
    private LinkedList<ListaItem> canciones;

    public ListaReproduccion() {
        canciones = new LinkedList<>();
    }

    public void ordenarLista() {
        this.canciones.sort(null);
    }

    public static void main(String[]args) {
        ListaReproduccion lista = new ListaReproduccion();


        lista.canciones.add(new ListaItem(new Cancion(0, "Let it be", "Beatles", 2.5, true )));
        lista.canciones.add(new ListaItem(new Cancion(1, "Bohemian Rhapsody", "Queen", 5.55, true)));
        lista.canciones.add(new ListaItem(new Cancion(2, "Smells Like Teen Spirit", "Nirvana", 5.01, true)));
        lista.canciones.add(new ListaItem(new Cancion(3, "Hotel California", "Eagles", 6.30, false)));
        lista.canciones.add(new ListaItem(new Cancion(4, "Imagine", "John Lennon", 3.07, true)));
        lista.canciones.add(new ListaItem(new Cancion(5, "Billie Jean", "Michael Jackson", 4.54, true)));
        lista.canciones.add(new ListaItem(new Cancion(6, "Wonderwall", "Oasis", 4.18, false)));        
        lista.canciones.add(new ListaItem(new Cancion(7, "Let it be", "Strokes", 2.5, true )));


        System.out.println(lista.canciones);


        lista.ordenarLista();

        System.out.println(lista.canciones);

    }
}
