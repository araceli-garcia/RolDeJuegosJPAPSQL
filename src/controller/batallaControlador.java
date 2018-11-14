/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.Batalla;
import service.BatallaService;
import service.BatallaServiceImpl;

/**
 *
 * @author LabInfo01
 */
public class batallaControlador {
    private BatallaService batallaService = new BatallaServiceImpl();
   
    public void crearCampeon(){
        System.out.println("Entro a la funcion crear");
        //Batalla c1 = new Batalla("yo", 23, "Hombre", 9, new BigDecimal(47.48000), new Date());
        //Batalla c2 = new Batalla("yo mero", 21, "Mujer", 2, new BigDecimal(47.48000), new Date());
        
        
        //batallaService.crearRegistro(c1);
        //batallaService.crearRegistro(c2);
        System.out.println("Salio... a la funcion crear");
    }
    
    /*public void actualizarCampeon(){
        Batalla c = batallaService.obtenerRegistro(new Long(2));
        c.setNombre("yo merengues");
        
        batallaService.actualizarRegistro(c);
    }
    
    public void eliminarCampeon(){
        Campeon c = campeonService.obtenerRegistro(new Long(2));
        
        campeonService.eliminarRegistro(c);
    }
    
    public void obtenerCampeon(){
        Campeon c = campeonService.obtenerRegistro(new Long(1));
        
        System.out.println("Id: " + c.getId());
        System.out.println("Nombre: " + c.getNombre());
    }
    
    public void obtenerCampeones(){
        for(Campeon c:campeonService.obtenerRegistros()){
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + c.getId());
            System.out.println("Nombre: " + c.getNombre());
        }
    }*/
}
