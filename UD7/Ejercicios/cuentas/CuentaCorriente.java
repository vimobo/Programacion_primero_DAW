public class CuentaCorriente extends Cuenta {

    // att
    private double importePorTransaccion;
    private int numTransacciones;
    private int numTransaccionesExentas;
    private boolean primeraGratis = true;

    // consturctores
    public CuentaCorriente() {
        this.setCuotaMantenimiento(-1);
    }

    public CuentaCorriente(String titular, String codigo, double saldo) {
        super(titular, codigo, saldo);
        this.setCuotaMantenimiento(-1);
        importePorTransaccion = -1;
        numTransacciones = 0;
        numTransaccionesExentas = 0;
    }

    // getters y setters
    public double getImportePorTransaccion() {
        return importePorTransaccion;
    }

    public void setImportePorTransaccion(double importePorTransaccion) {
        this.importePorTransaccion = importePorTransaccion;
    }

    public int getNumTransacciones() {
        return numTransacciones;
    }

    public int getNumTransaccionesExentas() {
        return numTransaccionesExentas;
    }

    public void setNumTransaccionesExentas(int numTransaccionesExentas) {
        this.numTransaccionesExentas = numTransaccionesExentas;
    }

    // aplicamos comisiones tenieno en cuenta las trasacciones exentas y el importe
    // por transaccion
    @Override
    public boolean aplicarComisiones() {
        boolean seHaRealizado = false;

        if (this.getCuotaMantenimiento() != -1) {
            this.retirar(this.getCuotaMantenimiento());
            seHaRealizado = true;
        }

        if (!primeraGratis && this.importePorTransaccion != -1) {
            this.retirar((this.getNumTransaccionesExentas() * this.importePorTransaccion));

            seHaRealizado = true;
        }

        if (primeraGratis) {
            primeraGratis = false;
        }

        this.numTransaccionesExentas = 0;

        return seHaRealizado;
    }

    // Transferencias modigicadas para añadir el contador de transacciones

    public boolean transferir(double cantidad, Cuenta destino) {
        boolean seHaRealizado = false;

        if (destino != null) {
            this.setSaldo(this.getSaldo() - cantidad);
            destino.setSaldo(destino.getSaldo() + cantidad);
            seHaRealizado = true;
            numTransacciones++;
            numTransaccionesExentas++;
        }

        return seHaRealizado;
    }

    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() +
                "\nImporte por Transaccion: " + importePorTransaccion +
                "\nNum Transacciones: " + numTransacciones +
                "\nNum Tranacciones Exentas: " + numTransaccionesExentas;
    }
}
