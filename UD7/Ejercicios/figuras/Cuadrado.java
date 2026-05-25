
public class Cuadrado extends Figuras implements Dibujable {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() throws Exception {

        int ladoInt = (int) (lado / 1);

        if (ladoInt <= 0) {
            throw new Exception("No se puede crear el cuadrado");
        } else {
            for (int i = 0; i < ladoInt; i++) {
                for (int j = 0; j < ladoInt; j++) {
                    if (i == 0 || i == ladoInt - 1) {
                        System.out.print("* ");
                    } else if (j == 0 || j == ladoInt - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
    }
}