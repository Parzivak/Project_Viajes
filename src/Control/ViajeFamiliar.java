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
public class ViajeFamiliar extends Viaje{
    //Atributos
    private int familia;

    //Constructor
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia=familia;
    }
    
    //Metodo sobreescrito de la clase padre VIAJE
    @Override
    public String descripcion() {
        return("Bienvenido a su viaje familiar :D");
    }
    
    //SETTERS AND GETTERS
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    
    
}
