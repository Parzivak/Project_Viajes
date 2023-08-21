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
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Origen";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigen method, of class Viaje.
     */
    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "Origen";
        Viaje instance = new ViajeIndividual("", "Destino", 100, new Date(), new Date());
        instance.setOrigen(origen);
        assertEquals(origen, instance.getOrigen());
    }

    /**
     * Test of getDestino method, of class Viaje.
     */
    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Destino";
        String result = instance.getDestino();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestino method, of class Viaje.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "Destino";
        Viaje instance = new ViajeIndividual("Origen", "", 100, new Date(), new Date());
        instance.setDestino(destino);
        assertEquals(destino, instance.getDestino());
    }

    /**
     * Test of getCosto method, of class Viaje.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 0, new Date(), new Date());
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCosto method, of class Viaje.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());;
        instance.setCosto(costo);
        assertEquals(costo, instance.getCosto());
    }

    /**
     * Test of getFechaSalida method, of class Viaje.
     */
    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, null, new Date());;
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaSalida method, of class Viaje.
     */
    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());;
        instance.setFechaSalida(fechaSalida);
        assertEquals(fechaSalida, instance.getFechaSalida());
    }

    /**
     * Test of getFechaLlegada method, of class Viaje.
     */
    @Test
    public void testGetFechaLlegada() {
        System.out.println("getFechaLlegada");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(),null);
        Date expResult = null;
        Date result = instance.getFechaLlegada();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaLlegada method, of class Viaje.
     */
    @Test
    public void testSetFechaLlegada() {
        System.out.println("setFechaLlegada");
        Date fechaLlegada = null;
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        instance.setFechaLlegada(fechaLlegada);
        assertEquals(fechaLlegada, instance.getFechaLlegada());
    }

    /**
     * Test of descripcion method, of class Viaje.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult ="Bienvenido a su viaje personal :D";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult = "Cualquier método implementado en la clase base";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class Viaje.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = new ViajeIndividual("Origen", "Destino", 100, new Date(), new Date());
        String expResult ="Cualquier método implementado en la clase base ";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
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
