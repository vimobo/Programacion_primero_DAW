/*Ejercicio 1
Diseñe una clase Cuenta que represente una cuenta bancaria (número de cuenta y saldo) y permita
realizar operaciones como ingresar y retirar una cantidad de dinero, así como realizar una
transferencia de una cuenta a otra.
•Represente gráficamente la clase utilizando la notación UML
•Defina la clase utilizando la sintaxis de Java, definiendo las variables de instancia y
métodos que crea necesarios.
•Implementa cada uno de los métodos de la clase. Los métodos deben actualizar el estado de
las variables de instancia y mostrar un mensaje en el que se indique que la operación se ha
realizado con éxito.int [] cuentas = {10, 1200, 700};
        String opcion = "";
        int idCuenta = 0;
        int cantidad = 0;
•Cree un programa en Java (en una clase llamada CuentaTest) que realice las siguientes
operaciones:
◦ Instancia 2 objetos de la clase Cuenta.
◦ Ingresa una cantidad en una cuenta y verifica que el saldo se ha incrementado.
◦ Reintegra una cantidad en una cuenta y verifica que el saldo ha disminuido.
◦ Transfiere una cantidad de una cuenta a la otra y verifica que los saldos finales sean
correctos.
◦ Para consultar el saldo de las cuentas puedes implementar un método toString().*/

import java.util.Scanner;

public class Cuenta {

    public static void main(String[] args) {

        int cantidad = 0;

        Cuenta cuenta1 = new Cuenta(1, 1000);
        Cuenta cuenta2 = new Cuenta(2, 2000);
    }

    private int saldo;
    private int id;

    public Cuenta(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public void ingresar(int cantidad) {
        System.out.println("Saldo anterior: " + saldo);
        saldo += cantidad;
        System.out.println("Saldo nuevo: " + saldo);
    }

    public void retirar(int cantidad) {
        System.out.println("Saldo anterior: " + saldo);
        saldo -= cantidad;
        System.out.println("Saldo nuevo: " + saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public String toString() {
        System.out.println("cuenta " + id + " saldo " + saldo);
    }

    public void transferencia(Cuenta cuenta, int cantidad) {
        System.out.println("Saldo anterior: " + saldo);
        saldo -= cantidad;
        System.out.println("Saldo nuevo: " + saldo);
        System.out.println("Saldo anterior: " + cuenta.saldo);
        cuenta.saldo += cantidad;
        System.out.println("Saldo nuevo: " + cuenta.saldo);

    }
}
