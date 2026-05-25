/**
 * Ejercicio de Repaso 3: Gestión de Flota (Nivel Ejercicio 3)
 * 
 * Este ejercicio se centra en el uso de atributos y métodos estáticos (static)
 * para llevar contadores globales.
 * 
 * Enunciado:
 * Crea una clase llamada Maquinaria y dos subclases: Excavadora y Grua.
 * 
 * Atributos estáticos (de clase): totalMaquinasAlquiladas y
 * horasTotalesTrabajadas.
 * 
 * Atributos de instancia: horasDeEstaMaquina.
 * 
 * Métodos:
 * 
 * trabajar(int horas): Suma las horas al contador individual de la máquina y al
 * contador global de la clase.
 * 
 * Un constructor que incremente el contador totalMaquinasAlquiladas cada vez
 * que se cree un objeto.
 * 
 * Programa Principal: Crea 2 excavadoras y 1 grúa. Haz que cada una trabaje
 * diferentes horas y, al final, muestra cuántas máquinas hay en total y la suma
 * de todas las horas trabajadas por la flota completa.
 */

public class Maquinaria {

    // att
    protected static int totalMaquinasAlquiladas;
    protected static int horasTotalesTrabajadas;
    protected int horasDeEstaMaquina;
    protected boolean alquilado;
    protected String nombre;
    protected int caballos;

    public Maquinaria(String nombre, int caballos) {
        this.nombre = nombre;
        this.caballos = caballos;
    }

    public void trabajar(int horas) {
        horasDeEstaMaquina += horas;
        horasTotalesTrabajadas += horas;
    }

    public void alquilar() {
        if (alquilado)
            alquilado = false;
        else
            alquilado = true;
        totalMaquinasAlquiladas++;
    }

    public String toString() {
        return "Total de maquinas: " + totalMaquinasAlquiladas +
                "horas totales: " + horasTotalesTrabajadas +
                "nombre: " + nombre +
                "horas de esta maquina: " + horasDeEstaMaquina +
                "caballos: " + caballos +
                "alquilado: " + alquilado;
    }

}