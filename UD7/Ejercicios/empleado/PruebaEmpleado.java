public class PruebaEmpleado {
    public static void main(String[] args) {

        // empleado ya no se puede usar ya que hemos cambiado la clase padre a abstracta
        // Empleado e1 = new Empleado("migue", 2000.50);
        // System.out.println("Salario Empleado: " + e1.calcularSueldo());

        // Gerente
        Gerente g1 = new Gerente("antonio", 1300.78, 200);
        System.out.println("Salario Gerente: " + g1.calcularSueldo());

        // Repartidor
        Repartidor r1 = new Repartidor("vic", 1200, 10);
        System.out.println("Sueldo Repartidor: " + r1.calcularSueldo());
    }
}