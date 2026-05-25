package figuras;

public class Rectangulo {

    // att clase
    private double altura;
    private double ancho;

    // constructores
    public Rectangulo() {
        this.altura = 0;
        this.ancho = 0;
    }

    public Rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    // métodos

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return ancho * altura;
    }

    public boolean esCuadrado() {
        boolean esCuadrado = false;
        if (altura == ancho)
            esCuadrado = true;

        return esCuadrado;
    }

    public String toString() {
        return "Altura: " + this.altura + "\nAncho: " + ancho;
    }
}