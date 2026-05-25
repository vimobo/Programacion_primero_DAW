public class Pajaro {

    private String nombre;
    private int posX;
    private int posY;

    public Pajaro(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }

    public double volar(int posX, int posY) {
        double resultado = Math.sqrt(
                Math.pow(posX - this.posX, 2) +
                        Math.pow(posY - this.posY, 2));
        return resultado;
    }

    public String toString() {
        String cad = String.format("\nnombre: %s\nX: %d\nY: %d", nombre, posX, posY);
        return cad;
    }

    public static void main(String[] args) {

        Pajaro piu = new Pajaro("piu", 10, 20);
        System.out.println(piu.volar(40, 20));
        System.out.println(piu);

    }

}
