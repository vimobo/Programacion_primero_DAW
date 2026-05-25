
//En este ejemplo implementamos Comparable para poder ordenar la coleccion en un tree
//ya que necesita ser comparado para saber el order, lo que permite además controlar que atributo
//es el que es comparado y como.
public class Par implements Comparable {
    private String clave;
    private int valor;

    public Par(String clave, int valor) {
        this.clave = clave;
        this.valor = valor;
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public int getValor() {
        return valor;
    }

    // toString
    @Override
    public String toString() {
        return "Par{" +
                "clave=" + clave +
                ", valor=" + valor +
                '}';
    }

    // implementamos equals en par

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        if (this.getClave().equals(((Par) obj).getClave())
                && this.getValor() == ((Par) obj).getValor())
            iguales = true;
        return iguales;
    }

    // En este caso podemos usar el método hashcode de String y devolverlo
    @Override
    public int hashCode() {
        return clave.hashCode();
    }

    // Es importante el uso del casting (Polimorfismo)
    @Override
    public int compareTo(Object obj) {
        return ((Par) obj).clave.compareTo(this.clave);
    }
}