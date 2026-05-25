import java.util.TreeSet;

public class AgendaContactos {
    public static void main(String[] args) {

        TreeSet<Contacto> coleccionOrdenada = new TreeSet<>();

        Contacto c1 = new Contacto("Miguel", "vi@gmail.com", 123455);
        Contacto c2 = new Contacto("Angel", "vi@gmail.com", 123455);
        Contacto c3 = new Contacto("Bocs", "vi@gmail.com", 123455);
        Contacto c4 = new Contacto("Bocs", "vi@gmail.com", 123455);

        coleccionOrdenada.add(c1);
        coleccionOrdenada.add(c2);
        coleccionOrdenada.add(c3);
        coleccionOrdenada.add(c4);

        for (Contacto c : coleccionOrdenada) {
            System.out.println(c);
        }
    }
}