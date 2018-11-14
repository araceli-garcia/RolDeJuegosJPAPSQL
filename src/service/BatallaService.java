
package service;

import java.util.List;
import model.Batalla;

public interface BatallaService {
    public  void crearRegistro(Batalla batalla);
    public void eliminarRegistro(Batalla batalla);
    public void actualizarRegistro(Batalla batalla);
    public List<Batalla> obtenerRegistros();
    public Batalla obtenerRegistro(Long idBatalla);
}
