
package service;

import java.util.List;
import model.Campeon;

public interface CampeonService {
    public  void crearRegistro(Campeon campeon);
    public void eliminarRegistro(Campeon campeon);
    public void actualizarRegistro(Campeon campeon);
    public List<Campeon> obtenerRegistros();
    public Campeon obtenerRegistro(Long idCampeon);
    
}
