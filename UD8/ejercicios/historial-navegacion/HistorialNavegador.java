import java.util.LinkedList;

public class HistorialNavegador {
    public static void main(String[] args) {
        // a) Instancia una LinkedList de tipo String llamada historial
        LinkedList<String> historial = new LinkedList<>();

        // b) El usuario visita, en orden, estas páginas. Como la última página visitada
        // es siempre la más
        // reciente, añádelas usando el método exclusivo .addFirst():

        historial.addFirst("https://www.google.com/search?q=google.com");
        historial.addFirst("wikipedia.org/Java");
        historial.addFirst("stackoverflow.com");
        historial.addFirst("github.com");

        // ) Imprime cuál es la página actual (la más reciente) usando .peekFirst() sin
        // borrarla de la lista
        System.out.println(historial.peekFirst());

        /*
         * El límite de memoria: Tu navegador está configurado para recordar solo las 3
         * últimas
         * páginas. Como actualmente tienes 4, elimina la más antigua (la que está al
         * final de la lista)
         * usando el método exclusivo .removeLast()
         */

        historial.removeLast();

        /*
         * e) Botón Atrás: El usuario pulsa el botón de retroceder. Elimina la página
         * actual (la primera)
         * usando .removeFirst() y guárdala en una variable temporal. Luego, imprime un
         * mensaje que
         * diga: "Saliendo de [página eliminada], volviendo a [nueva página actual]".
         */
        historial.removeFirst();

        // Imprime el resultado final
        System.out.println("*******HISTORIAL*******");

        for (String s : historial) {
            System.out.println(s);
        }
    }
}