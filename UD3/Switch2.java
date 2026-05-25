import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        char nota;

        // introducimos los datos
        System.out.println("Introduce tu nota (A-F)");
        nota = sc.nextLine().toUpperCase().charAt(0);

        // operamos
        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Notable");
                break;
            case 'C':
                System.out.println("Aprobado");
                break;
            case 'D':
                System.out.println("Insuficiente");
                break;
            case 'F':
                System.out.println("Reprobado");
            default:
                System.out.println("Calificación no válida");
                break;
        }
    }
}