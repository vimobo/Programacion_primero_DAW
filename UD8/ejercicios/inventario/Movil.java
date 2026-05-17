public class Movil extends Dispositivo {
   private int tamBateria;
   private String senyal;

   public Movil(String nombre, String marca, double precio, int stock, int tamBateria, String senyal) {
        super(nombre, marca, precio, stock);
        this.senyal = senyal;
        this.tamBateria = tamBateria;   
   }
}