public class PagoTarjeta implements MetodoPago {

    protected int numTarjeta;

    public PagoTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void pagar(double cantidad) {

    }
}