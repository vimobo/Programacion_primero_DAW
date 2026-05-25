public class PruebaCuentas {
    public static void main(String[] args) {

        CuentaAhorro ca1 = new CuentaAhorro();

        ca1.setSaldo(200);
        ca1.setCodigo("123");
        ca1.setTitular("antonio");
        ca1.setCuotaMantenimiento(10);

        CuentaCorriente cc1 = new CuentaCorriente("miguel", "456", 1000);
        cc1.setImportePorTransaccion(5);
        cc1.setCuotaMantenimiento(10);

        System.out.println(cc1.getSaldo());
        System.out.println(ca1.getSaldo());

        ca1.ingresar(10000);
        cc1.ingresar(10000);

        // transferencia
        if (cc1.transferir(2000, ca1)) {
            System.out.println("se hizo");
        } else {
            System.out.println("no se hizo");
        }

        System.out.println(cc1.getSaldo());
        System.out.println(ca1.getSaldo());

        // comisiones aplicadas gratis la primera transferencia
        if (cc1.aplicarComisiones()) {
            System.out.println("se hizo");
        } else {
            System.out.println("no se hizo");
        }

        System.out.println(cc1.getSaldo());
        System.out.println(ca1.getSaldo());

        // otra trasferencia y aplicado de comisiones, deberia restar 15

        if (cc1.transferir(2000, ca1)) {
            System.out.println("se hizo");
        } else {
            System.out.println("no se hizo");
        }

        System.out.println(cc1.getSaldo());

        System.out.println(ca1.getSaldo());
        if (cc1.aplicarComisiones()) {
            System.out.println("se hizo");
        } else {
            System.out.println("no se hizo");
        }

        System.out.println(cc1.imprimirDatos());
        System.out.println(ca1.imprimirDatos());
        System.out.println();

    }
}