
//se declara como tipos genericos para la clase
public class ParGenerico<K, V> {
    private K clave; // K es de Key (unique id)
    private V valor; // V de Value

    // se substituyen en el constructor los tipos de los parametros
    public ParGenerico(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public static void main(String[] args) {

        // Para instanciar hay que
        ParGenerico<String, Integer> pg1 = new ParGenerico<>("holaa", 12);
        System.out.println(pg1);

    }

}