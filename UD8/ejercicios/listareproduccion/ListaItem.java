public class ListaItem implements Comparable<ListaItem> {
    private Cancion cancion;
    private int reproducciones;

    public ListaItem (Cancion cancion) {
        this.cancion = cancion;
        this.reproducciones = 0;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void reporducir() {
        this.reproducciones++;
        this.cancion.setReproduccionesTotales(this.cancion.getReproduccionesTotales() + 1);
    }
    
    @Override
    public String toString(){
        return this.cancion.toString() + 
        "\nReproducciones\t|\t\t" + this.getReproducciones() +
        "\nReproducciones Totales\t|\t\t" + this.getCancion().getReproduccionesTotales() ;
        
    }

    @Override
    public boolean equals(Object otra) {
        return (this.getCancion().getTitulo().equals(((ListaItem)otra).getCancion().getTitulo()) &&
                this.getCancion().getArtista().equals(((ListaItem)otra).getCancion().getArtista()));
    }

    @Override
    public int compareTo(ListaItem otra){
        int x;
        if (this.getCancion().getTitulo().compareTo(otra.getCancion().getTitulo()) != 0) {
            x = this.getCancion().getTitulo().compareTo(otra.getCancion().getTitulo());
        }
        else {
            x = this.getCancion().getArtista().compareTo(otra.getCancion().getArtista());
        }
        return x;
    }
}
