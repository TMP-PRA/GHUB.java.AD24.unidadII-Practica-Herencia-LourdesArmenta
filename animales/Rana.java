package animales;
public class Rana extends Anfibio{
    // Atributos
    private String color;
    // Constructor
    public Rana(){
        super();
        color = "Sin color";
    }
    public Rana(String nombre, boolean cola, String color){
        super(nombre, cola);
        this.color = color;
    }
    // Metodos
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    public void setCola(boolean cola){
        super.setCola(cola);
    }
    public boolean getCola(){
        return super.getCola();
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}