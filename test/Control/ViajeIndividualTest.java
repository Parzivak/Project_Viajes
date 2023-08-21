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
public class ViajeIndividualTest {
    
    public ViajeIndividualTest() {
    }

    /**
     * Test of descripcion method, of class ViajeIndividual.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeIndividual instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Bienvenido a su viaje personal :D";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        
    }
    
}
