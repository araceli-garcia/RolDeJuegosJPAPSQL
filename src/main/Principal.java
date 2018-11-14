
package main;

import controller.campeonController;
import controller.jugadorController;


public class Principal {
    public static void main(String[] args) {
        
     jugadorController jc = new jugadorController();
     jc.crearJugador();
     
     jc.obtenerJugador();
     
     campeonController cc = new campeonController();
     
     cc.crearCampeon();
     
     //
     //cc.obtenerCampeon();
    }
}
