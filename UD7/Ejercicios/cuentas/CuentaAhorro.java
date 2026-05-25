public class CuentaAhorro extends Cuenta {

    private double tipoInteres;

    public CuentaAhorro() {
        this.tipoInteres = -1;

    }

    public CuentaAhorro(String titular, String codigo, double saldo) {
        super(titular, codigo, saldo);
        this.setCuotaMantenimiento(-1);
        this.tipoInteres = -1;

    }

    public void setTipoInteres(double cantidad) {
        this.tipoInteres = cantidad;
    }

    public double getTipoInteres() {
        return this.tipoInteres;
    }

    @Override
    public boolean aplicarComisiones() {
        boolean seHaRealizado = false;

        if (this.getCuotaMantenimiento() != -1 && this.tipoInteres != -1) {
            this.retirar(this.getCuotaMantenimiento());
            this.ingresar((this.getSaldo() * this.tipoInteres / 100) + this.getSaldo());
            seHaRealizado = true;
        }

        return seHaRealizado;
    }

    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() +
                "\nTipo de Interes: " + tipoInteres;
    }

}