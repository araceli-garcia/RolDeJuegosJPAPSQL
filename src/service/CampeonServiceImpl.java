
package service;

import dao.CampeonDao;
import dao.CampeonDaoImpl;
import java.util.List;
import model.Campeon;

public class CampeonServiceImpl implements CampeonService{
    private CampeonDao campeonDao = new CampeonDaoImpl();
    @Override
    public void crearRegistro(Campeon campeon) {
        campeonDao.crearRegistro(campeon);
    }

    @Override
    public void eliminarRegistro(Campeon campeon) {
        campeonDao.eliminarRegistro(campeon);
    }

    @Override
    public void actualizarRegistro(Campeon campeon) {
        campeonDao.actualizarRegistro(campeon);
    }

    @Override
    public List<Campeon> obtenerRegistros() {
        return campeonDao.obtenerRegistros();
    }

    @Override
    public Campeon obtenerRegistro(Long idCampeon) {
        return campeonDao.obtenerRegistro(idCampeon);
    }
    
}
