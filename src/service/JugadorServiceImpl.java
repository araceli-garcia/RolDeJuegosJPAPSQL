
package service;

import dao.JugadorDao;
import dao.JugadorDaoImpl;
import java.util.List;
import model.Jugador;


public class JugadorServiceImpl implements JugadorService{
    private JugadorDao jugadorDao = new JugadorDaoImpl();
    
    @Override
    public void crearRegistro(Jugador jugador) {
       jugadorDao.crearRegistro(jugador);
    }

    @Override
    public void actualizarRegistro(Jugador jugador) {
        jugadorDao.actualizarRegistro(jugador);
    }

    @Override
    public List<Jugador> obtenerRegistros() {
        return jugadorDao.obtenerRegistros();
    }

    @Override
    public Jugador obtenerRegistro(Long idJugador) {
        return jugadorDao.obtenerRegistro(idJugador);
    }

    @Override
    public void eliminarRegistro(Jugador jugador) {
        jugadorDao.eliminarRegistro(jugador);
    }
    
}
