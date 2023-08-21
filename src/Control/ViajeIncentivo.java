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
public class ViajeIncentivo extends Viaje{
    //Atributos
    private String empresa="";

    //Constructor
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa=empresa;
    }
    
    
     //Metodo sobreescrito de la clase padre VIAJE
    @Override
    public String descripcion() {
        return("Bienvenido a su viaje patrocinado por la empresa: "+ this.empresa);
    }
    
    //SETTERS AND GETTERS
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    //Metodo sobreescrito de la clase padre VIAJE
    @Override
    public String cualquierMetodo2(){
        return "Metodo implementado desde la clase VIAJE INCENTIVO";
    }
    
}
