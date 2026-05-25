/*Ejercicio 4
Crea una clase Libro con los atributos titulo, autor, isbn, editorial y precio. Crea un array de
objetos Libro y ordénalos por precio de menor a mayor. Luego, muestra el listado de libros
ordenados. */
package libro;

public class Libro {

    // atributos de la clase
    public String titulo;
    private String autor;
    private int isbn;
    private String editorial;
    private double precio;

    // constructor vacio
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.isbn = -1;
        this.editorial = "";
        this.precio = -1;
    }

    public String getTitulo() {
        return this.titulo;
    }

    // constructor con todos los parametros
    public Libro(String titulo, String autor, int isbn, String editorial, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.precio = precio;
    }

    // imprime todos los atributos del objeto
    public void imprimirLibro() {

        System.out.println("**********************");
        System.out.println("titulo: " + this.titulo);
        System.out.println("autor: " + this.autor);
        System.out.println("isbn: " + this.isbn);
        System.out.println("editroial: " + this.editorial);
        System.out.println("precio: " + this.precio);
    }

    public static void main(String[] args) {
        Libro[] arrayLibros = new Libro[5];

        // creacion de 5 objetos
        arrayLibros[0] = new Libro("antornio", "mario", 123, "maiko", 10);
        arrayLibros[1] = new Libro("antornio", "mario", 123, "maiko", 200);
        arrayLibros[2] = new Libro("antornio", "mario", 123, "maiko", 30);
        arrayLibros[3] = new Libro("antornio", "mario", 123, "maiko", 450);
        arrayLibros[4] = new Libro("antornio", "mario", 123, "maiko", 150);

        // bucle que ordena por precio con una variable auxiliar, si el libro siguiente
        // es mas caro cambia la posición
        for (int i = 0; i < arrayLibros.length; i++) {
            for (int j = 0; j < arrayLibros.length - 1 - i; j++) {
                if (arrayLibros[j].precio > arrayLibros[j + 1].precio) {
                    Libro aux = arrayLibros[j];
                    arrayLibros[j] = arrayLibros[j + 1];
                    arrayLibros[j + 1] = aux;
                }

            }
        }

        for (int i = 0; i < arrayLibros.length; i++) {
            arrayLibros[i].imprimirLibro();
        }
    }
}