import javax.swing.JOptionPane;
import java.util.HashSet;

//aquí empezamos a usar las interfaces gráficas, para que el user puede tener una experiència mas bonita
public class InterfazGrafica {
    public static void main(String[] args) {

        int suma = 0;
        HashSet<Integer> set = new HashSet<>();

        // Podemos añadir los valores directamente, aunque devuelven un String.
        for (int i = 0; i < 5; i++) {
            set.add(Integer.parseInt(JOptionPane.showInputDialog("Introduce valor " + (i + 1) + ": ")));
        }

        // enhanced for
        for (Integer i : set) {
            suma += i;
        }

        // imprimimos resultado
        JOptionPane.showMessageDialog(null, "El total es " + suma);
    }
}