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
 * @author PARZIVAL
 */
public class ViajeTest {
    
    public ViajeTest() {
    }

    /**
     * Test of getOrigen method, of class Viaje.
     */
    @Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Viaje instance = null;
        String expResult = "";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigen method, of class Viaje.
     */
    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "";
        Viaje instance = null;
        instance.setOrigen(origen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestino method, of class Viaje.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Viaje instance = null;
        String expResult = "";
        String result = instance.getDestino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestino method, of class Viaje.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Viaje instance = null;
        instance.setDestino(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Viaje.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Viaje instance = null;
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCosto method, of class Viaje.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Viaje instance = null;
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSalida method, of class Viaje.
     */
    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        Viaje instance = null;
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaSalida method, of class Viaje.
     */
    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        Viaje instance = null;
        instance.setFechaSalida(fechaSalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaLlegada method, of class Viaje.
     */
    @Test
    public void testGetFechaLlegada() {
        System.out.println("getFechaLlegada");
        Viaje instance = null;
        Date expResult = null;
        Date result = instance.getFechaLlegada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaLlegada method, of class Viaje.
     */
    @Test
    public void testSetFechaLlegada() {
        System.out.println("setFechaLlegada");
        Date fechaLlegada = null;
        Viaje instance = null;
        instance.setFechaLlegada(fechaLlegada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descripcion method, of class Viaje.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        Viaje instance = null;
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo2 method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ViajeImpl extends Viaje {

        public ViajeImpl() {
            super("", "", 0, null, null);
        }

        public String descripcion() {
            return "";
        }
    }
    
}
