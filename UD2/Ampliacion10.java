public class Ampliacion10 {

    public enum Perros {
        mastin, terrier, bulldog, pekines, caniche, galgo
    }

    public static void main(String[] args) {

        boolean compara;

        Perros var1 = Perros.mastin;
        Perros var2 = Perros.pekines;

        compara = var1.equals(var2);

        System.out.println("Perro 1:" + var1);
        System.out.println("Perro 2:" + var2);
        System.out.println(compara ? "Misma raza" : "Otra raza");
        System.out.println(var1 + " posicion: " + var1.ordinal());
        System.out.println(var1 + " posicion: " + var2.ordinal());
    }
}