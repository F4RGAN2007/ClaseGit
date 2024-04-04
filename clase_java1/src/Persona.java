import java.security.PublicKey;

public class Persona {
    private String nombre;
    private Tipodocumento tipoDedocumento;
    private Colorpelo colorpelo;
    public Persona(String nombre, Tipodocumento tipoDedocumento, Colorpelo colorpelo) {
        this.nombre = nombre;
        this.tipoDedocumento = tipoDedocumento;
        this.colorpelo = colorpelo;
    }
    public Persona(){

    }
    public String getNombre(){
        return this.nombre;
    }
    public String setNombre(String nombre){
        this.nombre = nombre;
    }
    public Tipodocumento getTipoDedocumento() {
        return tipoDedocumento;
    }
    public void setTipoDedocumento(Tipodocumento tipoDedocumento) {
        this.tipoDedocumento = tipoDedocumento;
    }
    public Colorpelo getColorpelo() {
        return colorpelo;
    }
    public void setColorpelo(Colorpelo colorpelo) {
        this.colorpelo = colorpelo;
    }
    
}
