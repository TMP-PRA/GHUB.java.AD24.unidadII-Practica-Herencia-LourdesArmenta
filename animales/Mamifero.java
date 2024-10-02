package animales;
public class Mamifero extends Animal{
    // Atributos
    private int patas;
    // Constructor
    public Mamifero(){
        super();
        patas = 0;
    }
    public Mamifero(String nombre, int patas){
        super(nombre);
        this.patas = patas;
    }
    // Metodos
    public void amamantar(){
        System.out.println("Estoy amamantando");
    }
    public void setPatas(int patas){
        this.patas = patas;
    }
    public int getPatas(){
        return patas;
    }
}