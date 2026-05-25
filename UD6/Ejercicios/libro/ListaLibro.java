
/**Ejercicio 6
Desarrollar una lista de Libros ordenada por título. La funcionalidad de la lista será la habitual:
conocer el número de libros que hay en la lista, insertar un nuevo libro (en la posición que le
corresponda), eliminar el libro de una determinada posición y obtener el libro de una determinada
posición. También incluirá un método para buscar un libro a partir de una parte de su título (sin
distinguir entre mayúsculas y minúsculas); el método devolverá la posición en la que se encuentra
el libro (–1 si no se encuentra). */

package libro;

public class ListaLibro {

    // atributos de la clase
    private Libro[] arrayLibro;
    int cantLibros = 0;

    // constructor vacio
    public ListaLibro() {
        this.arrayLibro = new Libro[5];
    }

    // añade un libro al array
    public void addLibro(Libro libro) {

        if (cantLibros < 3) {
            arrayLibro[cantLibros] = libro;
            cantLibros++;
        } else {
            System.out.println("Demasiados libros ya listillo");
        }
    }

    // imprime todos los libros
    public void imprimirArrayLibros() {
        for (int i = 0; i < this.arrayLibro.length; i++) {
            this.arrayLibro[i].imprimirLibro();
        }
    }

    public int buscarLibro(String tituloLib) {
        int pos = -1;
        for (int i = 0; i < this.arrayLibro.length; i++) {
            if (arrayLibro[i].getTitulo().toLowerCase().contains(tituloLib.toLowerCase())) {
                pos = i;
            }
        }
        return pos;
    }

    // ordena el array alfabeticamente con compare to, el cual devuelve 0 -1 o +1
    // dependiendo de la comparacion alfabetica
    // si el numero de inicial es mayor que el siguiente se intercambia la posicion
    public void ordenarArrayLibros() {
        Libro aux = new Libro();

        for (int i = 0; i < this.arrayLibro.length; i++) {
            for (int j = 0; j < this.arrayLibro.length - 1; j++) {
                if (this.arrayLibro[j].titulo.toLowerCase()
                        .compareTo(this.arrayLibro[j + 1].titulo.toLowerCase()) > 0) {
                    aux = this.arrayLibro[j];
                    this.arrayLibro[j] = this.arrayLibro[j + 1];
                    this.arrayLibro[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        // inicializamos los libros y la lista de libros
        ListaLibro arrayLibros = new ListaLibro();
        arrayLibros.arrayLibro[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 978030, "Sudamericana",
                471);
        arrayLibros.arrayLibro[1] = new Libro("1984", "George Orwell", 978045, "Secker & Warburg", 328);
        arrayLibros.arrayLibro[2] = new Libro("El Quijote", "Miguel de Cervantes", 978842, "Francisco de Robles", 1032);
        arrayLibros.arrayLibro[3] = new Libro("El Principito", "Antoine de Saint-Exupéry", 978207, "Gallimard", 96);
        arrayLibros.arrayLibro[4] = new Libro("Aundación", "Isaac Asimov", 978034, "Gnome Press", 255);

        // ordenar e imprimir
        arrayLibros.ordenarArrayLibros();
        arrayLibros.imprimirArrayLibros();
        System.out.println("posicion del libro buscado -> \"cien\"" + arrayLibros.buscarLibro("El p"));

    }
}