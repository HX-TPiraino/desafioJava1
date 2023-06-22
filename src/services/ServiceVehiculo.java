/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entitys.Vehiculo;

/**
 *
 * @author tpira
 * 
 * SeteoDeTipo F
 * Moverme F
 * Frenarme 
 */
public class ServiceVehiculo {
    
    public void seteoDeTipo(String tipo, Vehiculo v){
        if(!"Bicicleta".equals(tipo) && !"Motocicleta".equals(tipo) && !"Automovil".equals(tipo)) {
            System.out.println("Tu Tipo no es correcto");
        } else {
            v.setTipo(tipo);
            System.out.println("Seteaste tu tipo");
        }
    }
    
    public int moverme(int segs, Vehiculo v) {
        
        int metrosAvanzados;
        switch(v.getTipo()){
            case "Bicicleta":
                metrosAvanzados = segs;
                break;
            case "Motocicleta":
                metrosAvanzados = segs * 2;
                break;
            default:
                metrosAvanzados = segs * 3;
        }
        
        return metrosAvanzados;
    }
    
    public int frenarme(Vehiculo v){
        return v.getTipo().equals("Bicicleta") ? 0 : 2;
    }
}
