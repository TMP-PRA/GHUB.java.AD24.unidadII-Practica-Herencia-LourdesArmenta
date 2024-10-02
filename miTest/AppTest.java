package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import animales.*;

class AppTest {

    @Test 
    void herencia() {
        Reptil r = new Reptil("Lagarto", true);
        Anfibio a = new Anfibio("Rana", true);
        Mamifero m = new Mamifero("Perro", 4);
        assertEquals("Lagarto", r.getNombre());
        assertEquals("Rana", a.getNombre());
        assertEquals("Perro", m.getNombre());
        assertEquals(true, r.getEscamas());
        assertEquals(true, a.getCola());
        assertEquals(4, m.getPatas());
    }
    


    @Test
    void polimorfismo() {
        Animal a = new Reptil("Lagarto", true);
        Animal b = new Anfibio("Rana", true);
        Animal c = new Mamifero("Perro", 4);
        assertEquals("Lagarto", a.getNombre());
        assertEquals("Rana", b.getNombre());
        assertEquals("Perro", c.getNombre());
        assertEquals(true, ((Reptil)a).getEscamas());
        assertEquals(true, ((Anfibio)b).getCola());
        assertEquals(4, ((Mamifero)c).getPatas());
    }

    @Test
    void herenciaCaballo() {
        Caballo caballo = new Caballo("Mustang", 4, "Pura Raza");
        
        // Verificar que Caballo es una instancia de Mamifero
        assertTrue(caballo instanceof Mamifero);
        
        // Verificar que Caballo es una instancia de Animal
        assertTrue(caballo instanceof Animal);
        
        // Verificar los atributos heredados
        assertEquals("Mustang", caballo.getNombre());
        assertEquals(4, caballo.getPatas());
        assertEquals("Pura Raza", caballo.getRaza());
    }
    @Test
    void herenciaRana() {
        Rana rana = new Rana("Froggy", true, "Verde");

        // Verificar que Rana es una instancia de Anfibio
        assertTrue(rana instanceof Anfibio);

        // Verificar que Rana es una instancia de Animal
        assertTrue(rana instanceof Animal);

        // Verificar los atributos heredados
        assertEquals("Froggy", rana.getNombre());
        assertTrue(rana.getCola());
        assertEquals("Verde", rana.getColor());
    }

    @Test
    void herenciaSerpiente() {
        Serpiente serpiente = new Serpiente("Cobra", true, "Neurotóxico");

        // Verificar que Serpiente es una instancia de Reptil
        assertTrue(serpiente instanceof Reptil);

        // Verificar que Serpiente es una instancia de Animal
        assertTrue(serpiente instanceof Animal);

        // Verificar los atributos heredados
        assertEquals("Cobra", serpiente.getNombre());
        assertTrue(serpiente.getEscamas());
        assertEquals("Neurotóxico", serpiente.getVeneno());
    }

}