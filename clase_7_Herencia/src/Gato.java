public class Gato extends Felino implements Mascota,Carnivoro {
    private String colorPelo;
    private String nombre;
    private int edad;
    static int numeroGatos = 0;
    
    public Gato(String colorPelo, String nombre, int edad, int tamañogarras, boolean cazan) {
        super(tamañogarras, cazan);
        this.colorPelo = colorPelo;
        this.nombre = nombre;
        this.edad = edad;
        numeroGatos++;
    }
    public static String maullan(){
        return "maulla";
    }
    public int getnumeroGatos(){
        return numeroGatos;
    }
    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public boolean arañaFuerte(String edad) {
        if(edad.equals("cachorro")){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public void saluden() {
        System.out.println("Sobando la pierna");
    }
    @Override
    public String formaDePedirComida() {
        return "Maoulla";
    }
    @Override
    public String formaDeMiar() {
        return "En el arenero";
    }
    @Override
    public void comerCarne() {
        System.out.println("Se la come");
    }
    @Override
    public String comidaFavorita() {
        return "pescado";
    }

    
}
