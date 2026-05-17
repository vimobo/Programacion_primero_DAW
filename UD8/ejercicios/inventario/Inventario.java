import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private HashMap<String, Dispositivo> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void anyadirProducto(String key, Dispositivo disp) {
        this.inventario.put(key, disp);
    }

    public void actualizarStock(String key, int stockASumar) {
        int stock = (this.inventario.get(key)).getStock();
        if (stock + stockASumar >= 0) {
           this.inventario.get(key).setStock(stock + stockASumar); 
        }
    }

    public void eliminarDispositivo(String key) {
        this.inventario.remove(key);
    }

    public void mostrarInventario() {

        for (Map.Entry<String, Dispositivo> entry: this.inventario.entrySet()) {
            System.out.println("***************");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {

        Inventario inv = new Inventario();
        inv.anyadirProducto("A21", new Movil(
                "nokia a21",
                "nokia",
                99.99,
                200,
                2000,
                "5G"));

        inv.anyadirProducto("A22", new Movil(
                "nokia a22",
                "nokia",
                99.99,
                200,
                2000,
                "5G"));

        inv.anyadirProducto("O21", new Ordenador(
                "Lenovo 2002H",
                "Lenovo",
                999.99,
                100,
                "INTEL CORE 7",
                "8GB",
            "1TB",
        "MSI_MOTHERBORD"));

        inv.mostrarInventario();
        

        inv.eliminarDispositivo("A22");
        inv.eliminarDispositivo("A22");

        inv.mostrarInventario();

    }
}