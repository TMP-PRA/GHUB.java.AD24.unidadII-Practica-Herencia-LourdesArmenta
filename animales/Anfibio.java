package animales;
public class Anfibio extends Animal{
    // Atributos
    private boolean cola;
    // Constructor
    public Anfibio(){
        super();
        cola = false;
    }
    public Anfibio(String nombre, boolean cola){
        super(nombre);
        this.cola = cola;
    }
    // Metodos
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    public void setCola(boolean cola){
        this.cola = cola;
    }
    public boolean getCola(){
        return cola;
    }
}
