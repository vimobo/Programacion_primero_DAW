
public class Circulo extends Figuras {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // usamos override porque el método padre tiene este metodo
    @Override
    public double calcularArea() {
        return radio * radio * Math.PI;
    }
}