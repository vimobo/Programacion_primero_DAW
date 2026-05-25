import java.util.Scanner;

public class Quizz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] preguntas = {
                { "Pregunta 1", "A) 1", "B) 2", "C) 3" },
                { "Pregunta 2", "A) 1", "B) 2", "C) 3" },
                { "Pregunta 3", "A) 1", "B) 2", "C) 3" },
                { "Pregunta 4", "A) 1", "B) 2", "C) 3" } };

        char[] respuestas = new char[4];
        char[] respuestasCorrejidas = new char[] { 'a', 'b', 'a', 'b' };

        int i = 0;
        int numeroPregunta = 0;
        int respuestasCorrectas = 0;
        String comprobacion;
        boolean entradaCorrecta = false;

        System.out.println("Bienveniido al exameneees");

        for (String[] row : preguntas) {

            do {
                for (String pregunta : row) {
                    System.out.println(pregunta);
                }

                System.out.println("Respuesta: ");
                comprobacion = sc.nextLine().toLowerCase();

                entradaCorrecta = comprobacion.matches("^[abc]$");

                if (!entradaCorrecta) {
                    System.out.println("Introduce a b c");
                }
            } while (!entradaCorrecta);

            respuestas[numeroPregunta] = comprobacion.charAt(0);
            numeroPregunta++;
        }

        for (i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == (respuestasCorrejidas[i])) {
                respuestasCorrectas++;
            }
        }
        System.out.println("Numero de respuestas correctas: " + respuestasCorrectas);
        sc.close();
    }
}