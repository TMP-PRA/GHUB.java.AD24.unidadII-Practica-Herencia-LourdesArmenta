package miPrincipal;
import animales.*;

public class Principal {
    

    public static void main(String[] args) {
        System.out.println("Probando la herencia de clases");
        Caballo c1 = new Caballo("Pegaso", 4, "Pura sangre");
        c1.comer();
        c1.dormir();
        c1.moverse();
        c1.respirar();
        c1.sonido();
        c1.galopar();
        System.out.println("Nombre: " + c1.getNombre());


    }
}