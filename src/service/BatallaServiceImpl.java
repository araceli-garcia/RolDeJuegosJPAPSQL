
package service;

import dao.BatallaDao;
import dao.BatallaDaoImpl;
import java.util.List;
import model.Batalla;

public class BatallaServiceImpl implements BatallaService{
private BatallaDao batallaDao = new BatallaDaoImpl();
    @Override
    public void crearRegistro(Batalla batalla) {
        batallaDao.crearRegistro(batalla);
    }

    @Override
    public void eliminarRegistro(Batalla batalla) {
        batallaDao.eliminarRegistro(batalla);
    }

    @Override
    public void actualizarRegistro(Batalla batalla) {
        batallaDao.actualizarRegistro(batalla);
    }

    @Override
    public List<Batalla> obtenerRegistros() {
        return batallaDao.obtenerRegistros();
    }

    @Override
    public Batalla obtenerRegistro(Long idBatalla) {
        return batallaDao.obtenerRegistro(idBatalla);
    }
    
}
