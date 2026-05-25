package ficha_personal;

import fecha.*;

public class FichaPersonal {

    private Fecha fechaActual = new Fecha(6, EnumMes.Febrero, 2026);
    private String nombre = "";
    private Fecha nacimiento = new Fecha(EnumMes.Enero);
    private int edad = 0;

    public FichaPersonal(String nombre, Fecha nacimiento, int edad) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = edad;
    }

    public FichaPersonal(String nombre, Fecha nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = nacimiento.diferenciaEnAnios(new Fecha(6, EnumMes.Febrero, 2026));
    }

    public FichaPersonal(int edad) {
        this.edad = edad;
    }

    public FichaPersonal(String nombre) {
        this.nombre = nombre;
    }

    public FichaPersonal(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Nacimiento " + nacimiento.toString() + "\n" +
                "Edad: " + edad;
    }
}