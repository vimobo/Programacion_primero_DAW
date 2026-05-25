
//clase padre de figuras geometricas
public abstract class Figuras {

    public static final int TIPOS = 3;

    // se usa abstract par que se sepa que todas las hijas necesitan este método
    // pero no se puede calcular en si solo con la clase Figuras
    public abstract double calcularArea();

}
