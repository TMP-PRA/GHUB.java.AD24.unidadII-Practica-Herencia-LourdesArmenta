package animales;
public class Reptil extends Animal{
    // Atributos
    private boolean escamas;
    // Constructor
    public Reptil(){
        super();
        escamas = false;
    }
    public Reptil(String nombre, boolean escamas){
        super(nombre);
        this.escamas = escamas;
    }
    // Metodos
    public void reptar(){
        System.out.println("Estoy reptando");
    }
    public void setEscamas(boolean escamas){
        this.escamas = escamas;
    }
    public boolean getEscamas(){
        return escamas;
    }
}