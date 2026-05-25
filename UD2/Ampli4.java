public class Ampli4 {

    public enum Coches {
        coche, moto, camion, autobus, bicicleta
    }

    public static void main(String[] args) {

        Coches var1 = Coches.moto;
        Coches var2 = Coches.bicicleta;

        System.out.println(var1);
        System.out.println(var2);

        System.out.println((var1.equals(var2)) ? "son iguales" : "diferentse");
        System.out.println((var1.ordinal() > var2.ordinal()) ? "antees" : "despues");

    }
}