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

public class Clientes {

    public Mascota[] arrayMascotas;
    private int dni;
    private String nombre;
    private int contadorMascota;

    public Mascota[] getArrayMascotas() {
        return this.arrayMascotas;
    }

    public Clientes(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        arrayMascotas = new Mascota[3];
    }

    public void imprimirArrayMascota() {
        for (int i = 0; i < arrayMascotas.length; i++) {

            System.out.println("Nombre: " + arrayMascotas[i].getNombre());
            System.out.println("Edad: " + arrayMascotas[i].getEdad());
            System.out.println("Especie: " + arrayMascotas[i].getEspecie());
            System.out.println("Peso: " + arrayMascotas[i].getPeso());
        }
    }

    public Mascota buscarMascotaPorNombre(String nombre) {
        for (int j = 0; j < arrayMascotas.length; j++) {
            if (arrayMascotas[j] != null) {
                if (arrayMascotas[j].getNombre().equalsIgnoreCase(nombre)) {
                    return arrayMascotas[j];
                }
            }
        }
        return null;
    }

    public void registrarMascota(Mascota mascota) {
        if (contadorMascota < 3) {

            arrayMascotas[contadorMascota] = mascota;
            contadorMascota++;
        } else
            System.out.println("ya tienes 3 mascotas");
    }

}