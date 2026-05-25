
/**Estás desarrollando una aplicación para gestionar contactos, y debes asegurarte de que no existan 
contactos duplicados y que estos aparecen en orden alfabético. Crea un programa en Java que haga 
uso   de   un  TreeSet  para   almacenar   objetos   de   la   clase  Contacto,   que   deberéis   implementar 
previamente y que contenga, como atributos de tipo String, el nombre, teléfono y correo del 
contacto. Muestra los contactos por pantalla y prueba a añadir un duplicado.
Ayuda   :   los TreeSet son conjuntos ordenados por lo que hay que decirles como se ordenan nuestras 
clases. */
import java.util.TreeSet;

public class ContactosTreeSet {
    public static void main(String[] args) {

        TreeSet<Contacto> agenda = new TreeSet<>();

        Contacto c1 = new Contacto("aa", 1, "aa@aa.com");
        Contacto c2 = new Contacto("bb", 2, "bb@bb.com");
        Contacto c3 = new Contacto("bb", 2, "bb@bb.com");

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);

        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }
}