/*Implementa una clase Carta que represente a una carta de una baraja de póker. De una carta
interesa conocer su número y su palo (almacenado como una única letra).
•Un constructor por defecto y un constructor de copia.
•Los métodos get que permitan acceder a los atributos.
•Los métodos set que en lugar de recibir los nuevos valores como argumento, los soliciten
por teclado. Se comprobarán que sean válidos y se volverán a solicitar mientras no lo sean.
Para que el número de la carta sea valido deberá estar entre 1 y 13 y el palo deberá ser una
de las siguientes letras: c,p,r,t que corresponden a corazones, picas, rombos y tréboles.
Un método mostrarCarta() que muestre por pantalla de que carta se trata con el siguiente
formato: es el <numero> de <palo> donde el número y el palo corresponden a los atributos
de la carta con las siguientes particularidades:
◦ El palo del número deberá mostrarse al completo, es decir se deberá sustituir la letra del
palo por el palo en cuestión.
◦ Si el número de la carta está entre 2 y 10 se mostrará normalmente. Para el resto de los
números 1,11,12,13 se cambiará respectivamente por As, Jack, Reina, Rey .
•Un método comparar(Carta) que reciba una carta como argumento y la compare con la
actual Indicando por pantalla cuál de ellas es la ganadora. Para esto se comprobará en primer
el número, si son distintos ganará la mayor, si son iguales se compararán los palos, el orden
de victoria es Trébol, Rombos, Picas, Corazones. Si las cartas son iguales se indicará que
hay un empate.
•Un método main en el que se creen 2 cartas, la primera con el constructor por defecto y se
inicialice con los métodos set, la segunda se copiará con el constructor de copia. Después se
mostrarán ambas cartas con el método mostrarCarta() y se compararán con el método
comparar. Después de esto se modificará la segunda con los métodos set y se volverán a
mostrar y comparar.*/
package carta;

import java.util.Scanner;

public class Carta {

    // att de la clase
    private char palo;
    private int numero;
    private static Scanner sc = new Scanner(System.in);

    // constructores
    public Carta() {

    }

    public Carta(int numero, char palo) {
        this.numero = numero;
        this.palo = palo;
    }

    // numero de la carta con regex
    public void setNumero() {
        String entrada;
        String patron = "^([1-9]|1[0-3])$";
        do {
            System.out.print("Introduce el numero de la carta (1-13): ");
            entrada = sc.nextLine().trim();
            if (!entrada.matches(patron)) {
                System.out.println("Incorrecto, debe ser entre 1 y 13.");
            }
        } while (!entrada.matches(patron));
        this.numero = Integer.parseInt(entrada);
    }

    // set palo con regex
    public void setPalo() {
        String palo;
        do {
            System.out.print("Introduce el palo de la carta(C, P, R, T): ");
            palo = sc.nextLine().toUpperCase();

            if (!palo.matches("^[CPRT]{1}$"))
                System.out.println("incorrecto, otra vez");
        } while (!palo.matches("^[C,P,R,T]{1}$"));

        this.palo = palo.charAt(0);
    }

    // imprime la carta con el nombre completo
    public String imprimirCarta() {

        String imprimirCarta = "";

        switch (this.numero) {
            case 1:
                imprimirCarta += "Numero: As";
                break;
            case 11:
                imprimirCarta += "Numero: Jack";
                break;
            case 12:
                imprimirCarta += "Numero: Reina";
                break;
            case 13:
                imprimirCarta += "Numero: Rey";
                break;
            default:
                imprimirCarta += "Numero: " + this.numero;
                break;
        }
        imprimirCarta += "\n";
        switch (this.palo) {
            case 'C':
                imprimirCarta += "Palo: Corazones";
                break;
            case 'P':
                imprimirCarta += "Palo: Picas";
                break;
            case 'R':
                imprimirCarta += "Palo: Rombos";
                break;
            case 'T':
                imprimirCarta += "Palo: Treboles";
                break;
        }

        return imprimirCarta;
    }

    // comprueba que carta gana
    public void comprobarCarta(Carta carta) {
        System.out.print("La carta ");
        System.out.println(this.imprimirCarta());
        String orden = "CRTP";

        if (carta.numero > this.numero)
            System.out.println(" gana a ");

        else if (carta.numero < this.numero)
            System.out.println(" pierde contra ");

        else if (carta.numero == this.numero) {
            if (carta.palo == this.palo)
                System.out.println("es igual que ");
            else if (orden.indexOf(this.palo) < orden.indexOf(carta.palo))
                System.out.println(" pierde contra ");
            else if (orden.indexOf(this.palo) > orden.indexOf(carta.palo))
                System.out.println(" gana a ");
        }
        System.out.println(carta.imprimirCarta());
    }

    // main para comprobar el funcionamento de los metodos
    public static void main(String[] args) {
        Carta c1 = new Carta(1, 'C');
        Carta c2 = new Carta(1, 'P');
        c1.setNumero();
        c1.setPalo();
        System.out.println(c1.imprimirCarta());

        c1.comprobarCarta(c2);
    }
}