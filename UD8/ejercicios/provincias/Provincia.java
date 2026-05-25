
public class Provincia implements Comparable<Provincia> {

    private String codProvincia;
    private String provincia;
    private int idProvincia;

    @Override
    public int compareTo(Provincia other) {
        int resultado = this.getIdProvincia() - other.getIdProvincia();

        return resultado;
    }

    public boolean equals(Provincia provincia) {
        boolean resultado = false;
        if (this.getCodProvincia() == provincia.getCodProvincia() &&
                this.getProvincia().equals(provincia.getProvincia()) &&
                this.getIdProvincia() == provincia.getIdProvincia())
            resultado = true;

        return resultado;
    }

    @Override
    public String toString() {
        return "{" +
                " codProvincia='" + getCodProvincia() + "'" +
                ", provincia='" + getProvincia() + "'" +
                ", idProvincia='" + getIdProvincia() + "'" +
                "}\n";
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += this.getCodProvincia().hashCode();
        hash += this.getProvincia().hashCode();
        hash += this.getIdProvincia();
        return hash;
    }

    public Provincia(String codProvincia, String provincia, int idProvincia) {
        this.codProvincia = codProvincia;
        this.provincia = provincia;
        this.idProvincia = idProvincia;
    }

    public String getCodProvincia() {
        return this.codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getIdProvincia() {
        return this.idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

}
