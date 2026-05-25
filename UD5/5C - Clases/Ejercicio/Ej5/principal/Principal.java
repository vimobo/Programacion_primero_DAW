package principal;

import figuras.*;

public class Principal {
    public static void main(String[] args) {

        // inicializamos 2 obj
        Rectangulo r1 = new Rectangulo(10.0, 15.0);
        Rectangulo r2 = new Rectangulo(20.0, 20.0);

        // to String por pantalla
        System.out.println("r1: " + r1.toString());
        System.out.println("r2: " + r2.toString());

        // metodo es cuadrado
        System.out.println("r1 es cuadrado?: " + r1.esCuadrado());
        System.out.println("r2 es cuadrado?: " + r2.esCuadrado());

        // vamos a usar set y get
        r1.setAltura(15.0);
        System.out.println(r1.getAltura());

        // area
        System.out.println(r1.getAltura() + " " + r1.getAncho());
        System.out.println("r1 area: " + r1.getArea());
    }
}