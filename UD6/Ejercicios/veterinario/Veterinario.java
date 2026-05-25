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

public class Veterinario {

    private Clientes[] arrayClientes;
    private String nombre;
    int contadorClientes;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        arrayClientes = new Clientes[20];
    }

    public void anyadirCliente(Clientes c) {
        arrayClientes[contadorClientes] = c;
        contadorClientes++;
    }

    public Mascota buscarMascotaPorNombreVet(String nombre) {
        for (int i = 0; i < contadorClientes; i++) {
            if (arrayClientes[i] != null) {
                Mascota m = arrayClientes[i].buscarMascotaPorNombre(nombre);
                if (m != null && m.getNombre() != null) {
                    return m;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Clientes c1 = new Clientes(1234, "Juanjo");
        Clientes c2 = new Clientes(1234, "maiki");
        Mascota m1 = new Mascota("juan", Mascota.Especie.Ave, 21, 10.5);
        Mascota m2 = new Mascota("ali", Mascota.Especie.Ave, 21, 10.5);
        Mascota m3 = new Mascota("miki", Mascota.Especie.Ave, 21, 10.5);
        Mascota m4 = new Mascota("boli", Mascota.Especie.Ave, 21, 10.5);
        Mascota m5 = new Mascota("bibi", Mascota.Especie.Ave, 21, 10.5);
        c1.registrarMascota(m1);
        c1.registrarMascota(m2);
        c1.registrarMascota(m3);
        c1.registrarMascota(m4);
        c2.registrarMascota(m5);
        // ... tus registros ...
        Veterinario v1 = new Veterinario("anita");
        v1.anyadirCliente(c1);

        v1.buscarMascotaPorNombreVet("ali").imprimirMascota();

    }
}
