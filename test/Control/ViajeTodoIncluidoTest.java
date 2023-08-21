/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Control;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ViajeTodoIncluidoTest {
    
    public ViajeTodoIncluidoTest() {
    }

    /**
     * Test of descripcion method, of class ViajeTodoIncluido.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeTodoIncluido instance = new ViajeTodoIncluido("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Bienvenido a su viaje todo incluido, pasala bien :D";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        
    }
    
}
