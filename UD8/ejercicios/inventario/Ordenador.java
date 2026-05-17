import java.security.PublicKey;

public class Ordenador extends Dispositivo {
    private String cpu;
    private String ram;
    private String drive;
    private String motherboard;

    public Ordenador(String nombre, String marca, double precio, int stock, String cpu, String ram, String drive,
            String motherboard) {
        super(nombre, marca, precio, stock);
        this.cpu = cpu;
        this.ram = ram;
        this.drive = drive;
        this.motherboard = motherboard;
    }

    public String toString() {
        return super.toString() + "cpu: " + cpu + "\nram: " + ram + "\ndrive: " + drive + "\nmotherboard: " + motherboard;
    }
}
