import java.util.Scanner;

public class MatrizPrueba {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        OperacionesMatrices matriz1 = new OperacionesMatrices();
        OperacionesMatrices matriz2 = new OperacionesMatrices();

        do {

            System.out.println("1- sumar matrices");
            System.out.println("2- restar matrices");
            System.out.println("3- producto escalar");
            System.out.println("4- Get Matriz");
            System.out.println("0- salir");
            System.out.print("Introduce la opcion que desees: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Sumando dos matrices...");
                    matriz1.sumarMatrices();
                    break;

                case 2:
                    System.out.println("Restar dos matrices...");
                    matriz1.restarMatrices();
                    break;

                case 3:
                    matriz1.productoEscalar(2, 1);
                    break;

                case 4:
                    System.out.println("Matriz 1 o 2?");
                    int opcion2 = sc.nextInt();
                    System.out.println("obj 1:");
                    matriz1.getMatriz(opcion2);
                    System.out.println("obj 2:");
                    matriz2.getMatriz(opcion2);

                    break;

                default:
                    System.out.println("adios amigo");
                    break;
            }

        } while (opcion != 0);

        matriz1.getMatriz(1);
        matriz2.getMatriz(1);
        // productoEscalar(matriz1, 4);
        matriz1.getMatriz(2);

    }
}