package animales;
public class Caballo extends Mamifero{
    // Atributos
    private String raza;
    // Constructor
    public Caballo(){
        super();
        raza = "Sin raza";
    }
    public Caballo(String nombre, int patas, String raza){
        super(nombre, patas);
        this.raza = raza;
    }
    // Metodos
    public void galopar(){
        System.out.println("Estoy galopando");
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public String getRaza(){
        return raza;
    }
}