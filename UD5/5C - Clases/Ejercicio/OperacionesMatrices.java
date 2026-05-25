/*Crea una clase con métodos para cada una de las siguientes opciones del menú:
1. Suma matrices
2. Resta de matrices
3. Producto escalar (el producto escalar da como resultado una matriz cuyos elementos han sido
multiplicados por un numero)
0. Salir
•
Los atributos de la clase son dos matrices cuadradas de 4x4 que se inicializan con números
aleatorios de 0 a 25 (en el constructor).
•Implementa los métodos que permitan acceder a cada uno de los atributos de la clase. Los
nombres de dichos métodos serán: getXXX () para obtener el valor del atributo XXX.
•Crea un método estático de nombre pasoAString para convertir una matriz cualquiera en un
String. Puedes usar este método para mostrar las matrices por pantalla.
•El método productoEscalar recibe dos parámetros: el número por el que multiplicar la
matriz y un segundo número que indica qué matriz de las dos hay que multiplicar.
•El menú se mostrará al usuario hasta que elija una de las opciones (se realizará la acción y
el programa finalizará) o introduzca 0 (mostrará un mensaje de despedida) finalizando el
programa.*/

public class OperacionesMatrices {

    private int[][] matriz1 = new int[4][4];
    private int[][] matriz2 = new int[4][4];

    public OperacionesMatrices() {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * (25));
                matriz2[i][j] = (int) (Math.random() * (25));
            }
        }
    }

    public void getMatriz(int idMatriz) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (idMatriz == 1)
                    System.out.print(matriz1[i][j] + "\t");
                else if (idMatriz == 2)
                    System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void sumarMatrices() {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] += matriz2[i][j];
            }
        }

    }

    public void restarMatrices() {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] -= matriz2[i][j];
            }
        }

    }

    public void productoEscalar(int exponente, int idMatriz) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (idMatriz == 1)
                    matriz1[i][j] *= exponente;

                else if (idMatriz == 2)
                    matriz2[i][j] *= exponente;
            }
        }
    }
}