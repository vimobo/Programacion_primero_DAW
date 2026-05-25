import paquete1.*;
import paquete1.paquete2.*;

public class Main {
    public static void main(String[] args) {
        Prueba1 p1 = new Prueba1("Enzo");
        Prueba2 p2 = new Prueba2("zinco");
        p1.mover();

        System.out.println(p1.nombre);
    }
}