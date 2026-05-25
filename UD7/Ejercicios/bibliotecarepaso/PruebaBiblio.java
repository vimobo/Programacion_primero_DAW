public class PruebaBiblio {
    public static void main(String[] args) {
        Publicacion[] publicaciones = new Publicacion[3];
        publicaciones[0] = new Libro("123456", "La Ruta Prohibida", 2007);
        publicaciones[1] = new Revista("444555", "Anio Cero", 2019, 344);
        publicaciones[2] = new Publicacion("456789", "La rosa del mundo", 1995);
        for (int i = 0; i < 3; i++)
            System.out.println(publicaciones[i]);
        System.out.println();
        // Primer prestamo
        ((Libro) publicaciones[0]).prestar();
        if (((Libro) publicaciones[0]).estaPrestado()) {
            System.out.println("El libro esta prestado\n");
        }
        /*
         * //Segundo prestamo
         * publicaciones[1]prestar();
         * if (((Libro)publicaciones[1]).estaPrestado()) {
         * System.out.println("El libro esta prestado\n");
         * }
         * 
         * //Tercer prestamo
         * publicaciones[2].prestar();
         * if (((Libro)publicaciones[2]).estaPrestado()) {
         * System.out.println("El libro esta prestado\n");
         * }
         */
    }
}