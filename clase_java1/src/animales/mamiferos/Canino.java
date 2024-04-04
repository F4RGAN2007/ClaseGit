package animales.mamiferos;



public class Canino extends Mamifero {
    private Boolean aulla;
    private String pedigree;
    private String lider;
    
    public Canino(Boolean aulla, String pedigree, String lider, String tipoSangre) {
        super(tipoSangre);
        this.aulla = aulla;
        this.pedigree = pedigree;
        this.lider = lider;
    }

    public Boolean getAulla() {
        return aulla;
    }

    public void setAulla(Boolean aulla) {
        this.aulla = aulla;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }
public void comen(){
    System.out.println("Agachandose");
}
    

}
