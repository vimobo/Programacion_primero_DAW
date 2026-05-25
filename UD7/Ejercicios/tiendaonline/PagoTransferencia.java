public class PagoTransferencia implements MetodoPago {

    // att
    protected int cuentaBancaria;

    // constructor
    public PagoTransferencia(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    // metodos
    @Override
    public void pagar(double cantidad) {

    }
}