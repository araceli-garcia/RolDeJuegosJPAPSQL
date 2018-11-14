
package controller;

import java.math.BigDecimal;
import java.util.Date;
import model.Campeon;
import service.CampeonService;
import service.CampeonServiceImpl;

public class campeonController{
    private CampeonService campeonService = new CampeonServiceImpl();
   
    public void crearCampeon(){
        System.out.println("Entro a la funcion crear");
        Campeon c1 = new Campeon("yo", 23, "Hombre", 9, new BigDecimal(47.48000), new Date());
        Campeon c2 = new Campeon("yo mero", 21, "Mujer", 2, new BigDecimal(47.48000), new Date());
        
        campeonService.crearRegistro(c1);
        campeonService.crearRegistro(c2);
        System.out.println("Salio... a la funcion crear");
    }
    
    public void actualizarCampeon(){
        Campeon c = campeonService.obtenerRegistro(new Long(2));
        c.setNombre("yo merengues");
        
        campeonService.actualizarRegistro(c);
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
    }
}
