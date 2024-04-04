package animales.mamiferos;

public class Mamifero {
    protected final boolean mamanLeche = true;
    private String tipoSangre;
    
    public Mamifero(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
}
