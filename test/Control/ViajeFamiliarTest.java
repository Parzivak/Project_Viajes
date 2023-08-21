/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Control;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilo
 */
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }

    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar("Origen", "Destino", 100, new Date(), new Date(),4);
        String expResult = "Bienvenido a su viaje familiar :D";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance =  new ViajeFamiliar("Origen", "Destino", 100, new Date(), new Date(),4);
        int expResult = 4;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 4;
        ViajeFamiliar instance = new ViajeFamiliar("Origen", "Destino", 100, new Date(), new Date(),4);
        instance.setFamilia(familia);
        
    }
    
}
