import java.util.HashSet;

public class HashSetPar {
    public static void main(String[] args) {

        HashSet<Par> hsP = new HashSet<>();

        // teoricamente no acepta duplicados, pero al no tener implementado compare y
        // hasHash
        Par p1 = new Par("Madrid", 25);
        Par p2 = new Par("Barcelona", 19);
        Par p3 = new Par("Barcelona", 19);

        hsP.add(p1);
        hsP.add(p2);
        hsP.add(p3);

        for (Par p : hsP) {
            System.out.println(p);
        }
    }
}