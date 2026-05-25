/* Ejemplo de HashMap <Par,Integer>: guarda objetos de la 
clase Par como clave y le asigna un entero como valor
*/

import java.util.*;

public class EjMapPar {
	public static void main(String[] args) {
		HashMap<Par, Integer> hM = new HashMap<>();

		// Creamos los objetos para guardarlos
		Par par1 = new Par("Madrid", 25);
		Par par2 = new Par("Barcelona", 19);
		Par par3 = new Par("Barcelona", 19);
		Par par4 = new Par("Granada", 13);

		// Guardamos
		hM.put(par1, 1);
		hM.put(par2, 2);
		hM.put(par3, 3);
		hM.put(par4, 4);

		// Mostramos los valores guardados
		System.out.println("HashMap");
		for (Par i : hM.keySet()) {
			System.out.println(i);
		}
	}
}