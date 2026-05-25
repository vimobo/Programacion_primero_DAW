import java.util.Scanner;

public class Ampliacion6 {

    public static void main(String[] args) {

        // Declaramos las variables y el objeto escaner
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        double notaFinal;
        boolean bucle = false;

        // primer bucle do por si esta mal la nota o hay excepcion
        do {

            // abrimos el try por si hay excepciones
            try {

                // pedimos los datos
                System.out.println("Introduce la nota 1 (10%)");
                nota1 = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce la nota 2 (30%)");
                nota2 = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce la nota 3 (60%)");
                nota3 = Integer.parseInt(sc.nextLine());

                // calculamos la nota final
                notaFinal = (nota1 * 0.1) + (nota2 * 0.3) + (nota3 * 0.6);

                // condicional para comprobar el rango de numeros
                if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota1 < 0 || nota2 < 0 || nota3 < 0) {
                    System.out.println("Introduce una nota del 0-10");
                    bucle = true;
                }

                else {

                    // condicional por si la PE no está aprobado
                    if (nota3 <= 5) {
                        System.out.println("No hace media porque tienes un " + nota3 + " en la PE");
                        if (notaFinal >= 4) {
                            System.out.printf("\nLa nota final es: 4\n");
                        } else {
                            System.out.printf("\nLa nota final es: %.2f\n", notaFinal);
                        }

                    }

                    // imprimimos la nota final
                    else {
                        System.out.printf("\nLa nota final es: %.2f\n", notaFinal);

                    }
                }
            }

            // lo que hace si se genera una excepcion en la pedida de datos
            catch (Exception e) {
                System.out.println("Escribe un numero cancirolo");
                bucle = true;
            }
        } while (bucle);
    }
}