import java.util.Scanner;

public class Ampliacion8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroMenor = 0;
        int numeroMayor = 0;
        int mcm = 1;
        int resto = 1;
        int i;
        boolean repetirBucle = false;

        do {
            try {
                repetirBucle = false;
                System.out.println("Introduce un numero");
                numeroMenor = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce otro numero");
                numeroMayor = Integer.parseInt(sc.nextLine());

                if (numeroMenor < 0 && numeroMayor < 0) {
                    System.out.println("Los dos numeros son negativos");
                    System.out.println("*******************************");
                    repetirBucle = true;
                }
            } catch (Exception e) {
                System.out.println("Ha habido una excepción: Introduce un numeroMayor entero");
                System.out.println("***************************************************");
                repetirBucle = true;
            }
        } while (repetirBucle);

        if (numeroMenor > numeroMayor) {
            mcm = numeroMenor;
            numeroMenor = numeroMayor;
            numeroMayor = mcm;
        }

        else {
            for (i = numeroMenor; resto != 0; i += numeroMenor) {
                resto = (i) % numeroMayor;
                // System.out.println(resto +" "+ i);
                mcm = i;
            }
            System.out.println(mcm);
        }
    }
}