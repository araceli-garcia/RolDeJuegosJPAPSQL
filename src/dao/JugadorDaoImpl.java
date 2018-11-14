
package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Jugador;


public class JugadorDaoImpl implements JugadorDao{
    private EntityManagerFactory emf;
    private EntityManager em;
    
    @Override
    public void crearRegistro(Jugador jugador) {
        // esto tiene que eir rn todo los metodos
        inicializarsesion();
        em.getTransaction().begin();
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.persist(jugador);
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public void actualizarRegistro(Jugador jugador) {
        inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        jugador.setFechaActualizacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(jugador); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public List<Jugador> obtenerRegistros() {
        inicializarsesion();
        List<Jugador> listaJugador = em
                .createQuery("SELECT j FROM Jugador j WHERE j.fechaEliminacion IS NULL")
                .getResultList();
        
        cerrarSesion();
        return listaJugador;
    }

    @Override
    public Jugador obtenerRegistro(Long idJugador) {
        inicializarsesion();
        Jugador jugador = em.find(Jugador.class, idJugador); // retorna todo el registro de esa Id
        
        cerrarSesion();
        return jugador;
    }

    @Override
    public void eliminarRegistro(Jugador jugador) {
        inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        jugador.setFechaEliminacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(jugador); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }
    // creacion de metodos
    
    private void inicializarsesion(){
        emf = Persistence.createEntityManagerFactory("RolDeJuegosPU");
        em = emf.createEntityManager();
    }
    
    private void cerrarSesion(){
        em.close();
        emf.close();
    }
}
