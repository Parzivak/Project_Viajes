/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Control;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PARZIVAL
 */
public class ViajeIncentivoTest {

    public ViajeIncentivoTest() {
    }

    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public  void testDescripcion() {
        System.out.println("descripcion");
        ViajeIncentivo instance = new ViajeIncentivo("Origen", "Destino", 100, new Date(), new Date(), "Mi Empresa");;
        String expResult ="Bienvenido a su viaje patrocinado por la empresa: "+ instance.getEmpresa();
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        ViajeIncentivo instance = new ViajeIncentivo("Origen", "Destino", 100, new Date(), new Date(), "Mi Empresa");
        String expResult = "Mi Empresa";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "Mi empresa";
        ViajeIncentivo instance = new ViajeIncentivo("Origen", "Destino", 100, new Date(), new Date(), "");;
        instance.setEmpresa(empresa);
        
        assertEquals(empresa, instance.getEmpresa());
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = new ViajeIncentivo("Origen", "Destino", 100, new Date(), new Date(), "");;;
        String expResult = "Metodo implementado desde la clase VIAJE INCENTIVO";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }

}
