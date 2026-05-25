public class Ampliacion5 {

    public static void main(String[] args) {

        // declaración de variables
        char a = 'H';
        char b = 'O';
        char c = 'L';
        char d = 'A';
        char e = 'S';
        String abcde;

        // concatenación con clase string builder

        StringBuilder sb = new StringBuilder();

        sb.append(a);
        sb.append(b);
        sb.append(c);
        sb.append(d);
        sb.append(e);

        abcde = sb.toString();
        // abcde = a + b + c + d + e;

        System.out.println("La concatenacion es: " + abcde);

    }

}