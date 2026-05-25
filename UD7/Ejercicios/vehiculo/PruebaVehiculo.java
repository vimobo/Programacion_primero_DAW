
/**
 * B) Crea un programa con una bicicleta y un coche. A continuación muestra un menú como el
siguientes:
OPCIONES - VEHÍCULOS
================================================
1. Rodar con bicicleta 10 km
2. Cambiar piñones – Muestra el cambio realizado
3. Ver kilometraje de la bicicleta (parcial/total)
4. Ver información completa de la bicicleta
5. Rodar con coche 10000 km
6. Revisar un coche
7. Ver kilometraje del coche (parcial/total)
8. Saber lo kilómetros que restan para la revisión del coche
9. Ver información completa del coche
10. Ver el número de vehículos creados
11. Ver kilometraje total de todos los vehículos creados
12. Salir
Elige una opción (1-12):
================================================
C) Añade y modifica los métodos que necesites para realizar todas las opciones del menú.
D) En aquellos métodos que pidas valores al usuario, implementa control de excepciones.
 */
import java.util.Scanner;

public class PruebaVehiculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion = "";
        int cantidad = 0;

        do {

            // menu
            System.out.println("OPCIONES - VEHÍCULOS");
            System.out.println("\n1. Rodar con bicicleta 10 km"
                    + "\n2. Cambiar piñones  Muestra el cambio realizado"
                    + "\n3. Ver kilometraje de la bicicleta (parcial/total)"
                    + "\n4. Ver informac +ión completa de la bicicleta"
                    + "\n5. Rodar con coche 10000 km"
                    + "\n6. Revisar un coche"
                    + "\n7. Ver kilometraje del coche (parcial/total)"
                    + "\n8. Saber lo kilómetros que restan para la revisión del coche"
                    + "\n9. Ver información completa del coche"
                    + "\n10. Ver el número de vehículos creados"
                    + "\n11. Ver kilometraje total de todos los vehículos creados"
                    + "\n12. Salir");
            System.out.print("\nElige una opción (1-12):");

            opcion = sc.nextLine().toLowerCase();

            Coche coche = new Coche(0, 0, 150);
            Bicicleta bici = new Bicicleta(0, 0, 3);

            switch (opcion) {

                case "1":
                    bici.recorrer(10);
                    System.out.println("La bici ha recorrido 10Km");
                    break;

                case "2":
                    System.out.print("Introduce la marcha: ");
                    cantidad = Integer.parseInt(sc.nextLine());

                    bici.cambiarPinones(cantidad);
                    System.out.println("Piñones: " + bici.getPinones());
                    break;

                case "3":
                    System.out.println(bici);
                    break;

                case "4":
                    System.out.println(bici.getKmParciales() + "  " + bici.getKmRecorridos());
                    break;

                case "5":
                    coche.recorrer(10000);
                    System.out.println("El coche recorrrio 10000 km");
                    break;

                case "6":
                    coche.resetearRevision();
                    System.out.println("Coche revisado");
                    break;

                case "7":
                    System.out.println(coche);
                    break;

                case "8":
                    System.out.println("Km hasta revision: " + coche.saberKmRevision());
                    break;

                case "9":
                    System.out.println(coche);
                    break;

                case "10":
                    System.out.println("Vehiculos creadps: " + Vehiculo.getVehiculosCreados());
                    break;

                case "11":
                    System.out.println("km totales de todos los vehiculos: " + Vehiculo.getKmTotales());
                    break;
                default:
                    System.out.println("Introduce una opcion correcta");
            }
            sc.nextLine();
        } while (!opcion.equals("s"));
    }
}