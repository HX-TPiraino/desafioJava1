/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiojava1;

import entitys.Vehiculo;
import services.ServiceVehiculo;

/**
 *
 * @author tpira
 * 
 * Paso 1 --> crear la clase F
 * Paso 2 --> crear servicios
 */
public class DesafioJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceVehiculo servicioVehiculo = new ServiceVehiculo();
        Vehiculo v = new Vehiculo("Fiat", "500s", 2018);
        servicioVehiculo.seteoDeTipo("Automovil", v);
        
        System.out.println("Corriste por " + (servicioVehiculo.moverme(10, v) + servicioVehiculo.frenarme(v)) + " Metros");
    
    }
    
}
