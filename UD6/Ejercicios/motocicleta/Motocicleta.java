package motocicleta;

public class Motocicleta {

    // att de la clase
    private int cv = 0;
    private int kmH = 0;
    private String matricula = "";

    // constructores
    public Motocicleta() {
    }

    public Motocicleta(int cv, int kmH, String matricula) {
        this.cv = cv;
        this.kmH = kmH;
        this.matricula = matricula;
    }

    // getters setters y toString
    public int getCv() {
        return this.cv;
    }

    public int getKmh() {
        return this.kmH;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setKmh(int kmH) {
        this.kmH = kmH;
    }

    public String toString() {
        return "Cv: " + cv + "\nKm/h: " + kmH + "\nmatricula: " + matricula;
    }

    // implementacion
    public static void main(String[] args) {

        Motocicleta m1 = new Motocicleta();
        Motocicleta m2 = new Motocicleta(100, 240, "JNL678");
        System.out.println(m2);

    }
}