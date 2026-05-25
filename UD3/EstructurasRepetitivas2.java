import java.util.Scanner;

public class EstructurasRepetitivas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resultado;
        int numero = 0;
        int i;
        resultado = (int) ((Math.random() * 100 - 1 + 1) + 1);
        System.out.println(resultado);

        for (i = 0; resultado != numero ^ i == 10; i++) {

            System.out.println("Adivina el numero random");
            numero = sc.nextInt();

            if (numero > resultado)
                System.out.println("el numero es mas pequeño");
            else if (numero < resultado)
                System.out.println("El numero es mayor");
            else
                System.out.println("enhorabuena! el numero era " + resultado);
        }

        if (resultado != numero)
            System.out.println("Has fallado tete");

        System.out.println("Lo has intentado " + i + " veces");

    }
}
