
package service;

import java.util.List;
import model.Jugador;

public interface JugadorService {
    public  void crearRegistro(Jugador jugador);
    public void eliminarRegistro(Jugador jugador);
    public void actualizarRegistro(Jugador jugador);
    public List<Jugador> obtenerRegistros();
    public Jugador obtenerRegistro(Long idJugador);
}
