package animales;
public class Animal{
    // Atributos
    private String nombre;
    // Constructor
    public Animal(){
        nombre = "Sin nombre";
    }
    public Animal(String nombre){
        this.nombre = nombre;
    }
    // Metodos
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    public void moverse(){
        System.out.println("Estoy moviendome");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    public void sonido(){
        System.out.println("Estoy haciendo un sonido");
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}