/**Ejercicio 8: Gestión de una Clínica Veterinaria (Nivel: Superior)

Aquí practicarás la relación entre objetos y la búsqueda por criterios múltiples.

    Clase Mascota: Atributos: nombre, especie (perro, gato, ave), edad y peso.

        Métodos getter/setter con validación (edad > 0).

    Clase Cliente: Atributos: dni, nombre y un array de objetos Mascota (un cliente puede tener hasta 3 mascotas).

        Método registrarMascota(Mascota m).

        Método calcularPesoMedio() de sus mascotas.

    Clase Veterinaria: Atributos: nombre y un array de Clientes (máximo 20).

        Método buscarMascotaPorNombre(String nombre): Recorre todos los clientes y sus mascotas para encontrarla. Si la encuentra, muestra los datos del dueño.

        Método informePacientesMayores(int limiteEdad): Muestra todas las mascotas de la clínica que superen esa edad. */

package veterinario;

public class Mascota {

    public enum Especie {
        GATO, PERRO, AVE
    }

    private String nombre;
    private Especie especie;
    private int edad;
    private double peso;

    public Mascota() {

    }

    public Mascota(String nombre, Especie especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String imprimirMascota(){
        return "Nombre: " + nombre 
        + "Edad: " + edad;
        + "Especie: " + especie
        + "Peso: " + peso
    }
}