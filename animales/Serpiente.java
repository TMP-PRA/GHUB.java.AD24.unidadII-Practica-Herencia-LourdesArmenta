package animales;
public class Serpiente extends Reptil{
    // Atributos
    private String veneno;
    // Constructor
    public Serpiente(){
        super();
        veneno = "Sin veneno";
    }
    public Serpiente(String nombre, boolean escamas, String veneno){
        super(nombre, escamas);
        this.veneno = veneno;
    }
    // Metodos
    public void morder(){
        System.out.println("Estoy mordiendo");
    }
    public void setVeneno(String veneno){
        this.veneno = veneno;
    }
    public String getVeneno(){
        return veneno;
    }
}