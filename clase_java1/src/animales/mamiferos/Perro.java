package animales.mamiferos;


public class Perro <g,t> extends Canino{
    private String nombre;
    private Raza Raza;
    private g cedula;
    private t longitud;
    Pulga pulguita;
    



    public Perro(Pulga pulguita,t longitud, g cedula,String nombre, Raza raza, boolean aulla, String pedigree, String lider, String tipoSangre) {
        super(aulla, pedigree, lider, tipoSangre);
        this.nombre = nombre;
        Raza = raza;
        this.cedula = cedula;
        this.longitud = longitud;
        this.pulguita = pulguita;

        
    }
    public G getCedula() {
        return cedula;
    }

    public void setCedula(G cedula) {
        this.cedula = cedula;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return Raza;
    }

    public void setRaza(Raza raza) {
        Raza = raza;
    }
    @Override
    public void comen(){
        System.out.println("saltando");
    }
    
    
    public void juegan(){
        System.out.println("juego xdxd");
    }
}
