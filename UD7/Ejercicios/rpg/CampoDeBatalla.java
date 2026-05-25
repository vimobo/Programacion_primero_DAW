public class CampoDeBatalla {
    public static void main(String[] args) {

        int dice = 0;
        int turno = 0;
        boolean derrotado = false;
        Mago mago = new Mago("Juan", 90, 100);
        Guerrero guerrero = new Guerrero("Patricia", 200, 100);

        try {

            turno = (int) ((Math.random() * 2) + 1);

            do {

                // Se controla el turno aleatoriamente y luego pasa de uno a otro.
                // de forma aleatoria se elige el ataque
                if (turno == 1) {

                    dice = (int) ((Math.random() * 3) + 1);
                    switch (dice) {

                        case 1:
                            if (mago.atacar(guerrero)) {
                                mago.atacar(guerrero);
                                System.out.println("\nMago Ataca a guerrero");
                            }
                            break;

                        case 2:
                            if (mago.curar(mago)) {
                                mago.curar(mago);
                                System.out.println("\nMago se cura");
                            }

                            break;
                        case 3:
                            System.out.println("\nMago ha fallado");
                            break;
                    }

                } else {

                    dice = (int) ((Math.random() * 2) + 1);

                    switch (dice) {
                        case 1:
                            if (guerrero.atacar(mago)) {
                                mago.atacar(guerrero);
                                System.out.println("\nGuerrero Ataca a mago");
                            }
                            break;
                        case 2:
                            System.out.println("\nGuerrero ha fallado");
                            break;
                    }

                }
                if (turno == 1)
                    turno = 0;
                else
                    turno = 1;

                System.out.println(mago);
                System.out.println(guerrero);

            } while (!derrotado);

        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }
    }
}