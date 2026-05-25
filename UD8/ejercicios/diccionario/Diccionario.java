/*Crea un diccionario de palabras donde tengamos como llave una palabra en castellano y su valor 
sea una palabra en inglés. Implementa directamente en un programa un objeto de HashMap que 
nos permita almacenar esa información, y haz los siguientes pasos:
•Añade unas palabras y sus respectivas traducciones.
•Busca la traducción de una palabra en castellano y obtén su traducción al inglés.
•Elimina una palabra del diccionario
•Muestra todas las palabras, junto con sus traducciones*/

import java.util.HashMap;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        // añadimos
        diccionario.put("manzana", "apple");
        diccionario.put("vino", "wine");
        diccionario.put("perro", "donaltrum");
        diccionario.put("pelota", "ball");

        // traduccion
        System.out.println(diccionario.get("manzana"));

        // remove
        diccionario.remove("pelota");

        // vemos todo
        /*
         * for(int i = 0; i < diccionario.size(); i++) {
         * System.out.println(diccionario.get());
         * }
         */

        for (String key : diccionario.keySet()) {
            System.out.println(key + " = " + diccionario.get(key));
        }

        // for ma alternativa que recorre ambos a la vez
        for (HashMap.Entry<String, String> entry : diccionario.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}