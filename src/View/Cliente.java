/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Control.Viaje;
import Control.ViajeFamiliar;
import Control.ViajeIncentivo;
import Control.ViajeIndividual;
import Control.ViajeTodoIncluido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente {

    public static List<Viaje> viajes = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leerViajes();
        mostrarViajes();
    }

    public static void leerViajes() {
        try {
            Viaje viaje1 = new ViajeFamiliar("Cali", "Santa Marta", 400000, new
                SimpleDateFormat("dd/MM/yyyy").parse("17/08/2023"), new
                SimpleDateFormat("dd/MM/yyyy").parse("22/08/2023"),4);
            viajes.add(viaje1);
                Viaje viaje2 = new ViajeIncentivo("Bogota", "Putumayo", 400000, new
                SimpleDateFormat("dd/MM/yyyy").parse("17/09/2023"), new
                SimpleDateFormat("dd/MM/yyyy").parse("22/09/2023"),"ICETEX");
            viajes.add(viaje2);
            Viaje viaje3 = new ViajeIndividual("Cali", "Islas gorgona", 400000, new
                SimpleDateFormat("dd/MM/yyyy").parse("17/08/2023"), new
                SimpleDateFormat("dd/MM/yyyy").parse("22/10/2023"));
            viajes.add(viaje3);
            Viaje viaje4 = new ViajeTodoIncluido("Palmira", "Rivera Maya", 400000, new
                SimpleDateFormat("dd/MM/yyyy").parse("17/08/2023"), new
                SimpleDateFormat("dd/MM/yyyy").parse("07/09/2023"));
            viajes.add(viaje4);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }
    
    public static void mostrarViajes(){
        for(Viaje viaje:viajes){
            System.out.println("");
            System.out.println("Origen: "+ viaje.getOrigen());
            System.out.println("Destino: "+ viaje.getDestino());
            System.out.println("FechaSalida: "+ viaje.getFechaSalida());
            System.out.println("FechaLlega: "+ viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: "+ viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo2());
            System.out.println("Cualquier metodo2: "+ viaje.cualquierMetodo2());
            System.out.println("-------------------------------------------------");
            System.out.println("");
        }
    }
}
