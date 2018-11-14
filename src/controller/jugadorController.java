/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.Jugador;
import service.JugadorService;
import service.JugadorServiceImpl;

/**
 *
 * @author LabInfo01
 */
public class jugadorController{
    private JugadorService jugadorService = new JugadorServiceImpl();
    public void crearJugador(){
        Jugador j1 = new Jugador("Mago Riga", 23, "hombre", 9, new Date());
        Jugador j2 = new Jugador("Paul mor", 23, "hombre", 9, new Date());
        
        jugadorService.crearRegistro(j1);
        jugadorService.crearRegistro(j2);
    }
    
    public void actualizarJugador(){
        Jugador j= jugadorService.obtenerRegistro(new Long(2));
        
        jugadorService.actualizarRegistro(j);
    }
    public void eliminarJugador(){
        Jugador j= jugadorService.obtenerRegistro(new Long(2));
        
        jugadorService.eliminarRegistro(j);
    }
    public void obtenerJugador(){
        Jugador j= jugadorService.obtenerRegistro(new Long(2));
        System.out.println("id: "+j.getId());
        System.out.println("Nombre: "+j.getNombre());
    }
    public void obtenerJugadores(){
        for(Jugador j:jugadorService.obtenerRegistros()){
            System.out.println("----------------------------");
            
            System.out.println("id: "+j.getId());
        System.out.println("Nombre: "+j.getNombre());
            
        }
    }
}
