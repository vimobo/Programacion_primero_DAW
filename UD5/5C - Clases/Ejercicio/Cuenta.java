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

    private double saldo;
    private int id;

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public void setSaldo(double cantidad) {
        saldo = cantidad;
    }

    public void setId(int nuevoId) {
        id = nuevoId;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        String cad = "cuenta " + id + " saldo " + saldo;
        return cad;
    }

    public void transferencia(Cuenta cuenta, double cantidad) {
        saldo -= cantidad;
        cuenta.saldo += cantidad;
    }
}
