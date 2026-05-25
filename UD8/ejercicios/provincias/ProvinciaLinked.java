
import java.util.LinkedList;

public class ProvinciaLinked {
    public static void main(String[] args) {

        Provincia p1 = new Provincia("GR", "Granada", 18);
        Provincia p2 = new Provincia("J", "Jaen", 23);
        Provincia p3 = new Provincia("AL", "Almeria", 04);
        Provincia p4 = new Provincia("CO", "Cordoba", 14);
        Provincia p5 = new Provincia("SE", "Sevilla", 41);
        Provincia p6 = new Provincia("MA", "Malaga", 29);
        Provincia p7 = new Provincia("CA", "Cadiz", 11);
        Provincia p8 = new Provincia("H", "Huelva", 21);

        LinkedList<Provincia> linked = new LinkedList<>();

        linked.add(p1);
        linked.add(p2);
        linked.add(p3);
        linked.add(p4);
        linked.add(p5);
        linked.add(p6);
        linked.add(p7);
        linked.add(p8);

        System.out.println(linked);

        System.out.println("***********************");

        linked.sort(null);
        System.out.println(linked);
    }
}