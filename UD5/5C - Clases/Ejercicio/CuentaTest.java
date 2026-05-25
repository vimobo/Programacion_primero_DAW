public class CuentaTest {

    public static void main(String[] args) {

        int cantidad = 0;

        Cuenta cuenta1 = new Cuenta(1, 1000);
        Cuenta cuenta2 = new Cuenta(2, 2000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("Cuenta 1 transfiere 200 a cuenta 2");
        cuenta1.transferencia(cuenta2, 200);
        System.out.println(cuenta2);
        System.out.println(cuenta1);

        System.out.println("Ingresamos 500 a cuenta 1");
        cuenta1.ingresar(500);
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("Set saldo cuenta1 a 3000");
        cuenta1.setSaldo(3000);
        System.out.println(cuenta1);
    }
}