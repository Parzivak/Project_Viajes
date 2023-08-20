/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.Date;

/**
 *
 * @author PARZIVAL
 */
public class ViajeIndividual extends Viaje{

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
     //Metodo sobreescrito de la clase padre VIAJE
    @Override
    public String descripcion() {
        return("Bienvenido a su viaje personal :D");
    }
    
}
