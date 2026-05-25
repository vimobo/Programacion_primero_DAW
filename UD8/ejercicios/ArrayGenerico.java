public class ArrayGenerico<T> {

    // aqui probaremos un array generico
    private T[] arrayGenerico;

    public ArrayGenerico(int longitud) {
        // usamos polimorfismo para hacer un array de tipo objeto, que es padre de todas
        // hacemos un casting para indicar el tipo de objeto que se almacenara
        // (Polimorfismo)
        arrayGenerico = (T[]) new Object[longitud];
    }

    // método para encontrar un valor que devuelve la posicion o -1 si no esta
    public int encontrarValor(T valor) {
        int valorEncontrado = -1;
        for (int i = 0; i < arrayGenerico.length; i++) {
            if (arrayGenerico[i] != null && arrayGenerico[i].equals(valor)) {
                valorEncontrado = i;
            }
        }
        return valorEncontrado;
    }

    // añade un valor al siguient espacio libre del array
    public void aniadirAArray(T valor) throws Exception {
        boolean hayEspacio = false;
        for (int i = 0; i < arrayGenerico.length && !hayEspacio; i++) {
            if (arrayGenerico[i] == null) {
                arrayGenerico[i] = valor;
                hayEspacio = true;
            }
        }
        if (!hayEspacio) {
            throw new Exception("No hay espacio");
        }
    }

    @Override
    public String toString() {
        String cad = "";
        for (int i = 0; i < arrayGenerico.length; i++) {
            cad += "\n" + arrayGenerico[i];
        }
        return cad;
    }

    public static void main(String[] args) {
        // instanciamos el array
        ArrayGenerico<Integer> a1 = new ArrayGenerico<>(10);
        try {
            // añadimos elementos al array
            a1.aniadirAArray(50);
            System.out.println(a1);

            a1.aniadirAArray(30);
            System.out.println(a1);

            System.out.println(a1.encontrarValor(20));
            System.out.println(a1.encontrarValor(30));
            System.out.println(a1);

            a1.aniadirAArray(100);

            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);
            a1.aniadirAArray(30);

            System.out.println(a1);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}