/**Ejercicio 5
Crea una clase Coche con atributos marca, modelo y año. Luego, crea un array de objetos Coche y
realiza una búsqueda para encontrar un coche por su marca. Imprime el coche encontrado o un
mensaje si no se encuentra. */

package coche;

public class Coche {

    // att de la clase
    private String modelo;
    private String marca;
    private int anyo;

    // constructores
    public Coche(String modelo, String marca, int anyo) {
        this.modelo = modelo;
        this.marca = marca;
        this.anyo = anyo;
    }

    // imprime los atributos del objeto
    public void imprimirCoche() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anyo);
    }

    public String getMarca() {
        return marca;
    }

    // busca una marca en el array
    public static void buscarCoche(Coche[] arrayCoches, String marcaBuscar) {

        boolean encontrado = false;
        for (int i = 0; i < arrayCoches.length; i++) {
            if (arrayCoches[i].getMarca().equals(marcaBuscar)) {
                arrayCoches[i].imprimirCoche();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro la marca " + marcaBuscar);
        }
    }

    // main para comprobar la implementación
    public static void main(String[] args) {

        Coche[] arrayCoches = new Coche[5];

        arrayCoches[0] = new Coche("ak47", "yundai", 2000);
        arrayCoches[1] = new Coche("yui", "yamaha", 2002);
        arrayCoches[2] = new Coche("pipo", "honda", 1990);
        arrayCoches[3] = new Coche("abc", "mercedes", 1890);
        arrayCoches[4] = new Coche("123", "maike", 2010);

        buscarCoche(arrayCoches, "yaha");
    }
}