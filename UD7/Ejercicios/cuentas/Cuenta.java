public abstract class Cuenta implements Imprimible {

    private String titular;
    private String codigo;
    private double saldo;
    private double cuotaMantenimiento;

    public Cuenta(String titular, String codigo, double saldo) {
        this.setCodigo(codigo);
        this.titular = titular;
        this.saldo = saldo;
        cuotaMantenimiento = -1;
    }

    public Cuenta() {
        cuotaMantenimiento = -1;
    }

    // get y set titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // get y set codigo
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // get y set saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // get y set cuota
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    // ingresar retirar y aplicar comisiones a la cuenta.
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public boolean transferir(double cantidad, Cuenta origen, Cuenta destino) {
        boolean seHaRealizado = false;

        if (destino != null && cantidad < origen.getSaldo()) {
            origen.retirar(cantidad);
            destino.ingresar(cantidad);
            seHaRealizado = true;
        }

        return seHaRealizado;
    }

    public boolean aplicarComisiones() {
        boolean seHaRealizado = false;

        if (this.cuotaMantenimiento != -1) {
            saldo -= cuotaMantenimiento;
            seHaRealizado = true;
        }

        return seHaRealizado;
    }

    @Override
    public String imprimirDatos() {
        return "\nTitular :" + titular +
                "\nCodigo: " + codigo +
                "\nSaldo: " + saldo +
                "\nCuota Mantenimiento" + cuotaMantenimiento;
    }
}