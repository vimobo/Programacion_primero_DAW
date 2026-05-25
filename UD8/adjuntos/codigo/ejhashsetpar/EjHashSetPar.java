//Ejemplo de HashSet con clase Par

import java.util.HashSet;

public class EjHashSetPar {
	public static void main(String[] args) {
		// Conjunto guardado usando tablas hash
		HashSet<Par> pares = new HashSet<>();

		// Guardamos dos pares en el conjunto
		Par par1 = new Par("Madrid", 25);
		Par par2 = new Par("Barcelona", 19);
		Par par3 = new Par("Barcelona", 19);

		pares.add(par1);
		pares.add(par2);
		pares.add(par3);

		// Mostramos los valores guardados
		for (Par i : pares) {
			System.out.println(i);
		}
	}
}