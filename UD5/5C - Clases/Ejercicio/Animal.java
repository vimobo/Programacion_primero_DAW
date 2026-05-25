public class Animal {

    // att
    private String nombre;
    private String raza;
    private short edad;

    // metodos

    // constructor
    public Animal(String nombre, String raza, short edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String razaNueva) {
        raza = razaNueva;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edadNueva) {
        edad = edadNueva;
    }

    public String toString() {

        String stringAnimal = String.format("\nnombre: %s\nraza: %s\nedad: %d", nombre, raza, edad);
        return stringAnimal;
    }

    public static void main(String[] args) {
        Animal perro = new Animal("popi", "gaa", (short) 12);
        System.out.println(perro);
    }
}
