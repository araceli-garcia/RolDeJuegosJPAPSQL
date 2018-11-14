
package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Campeon;

public class CampeonDaoImpl implements CampeonDao{
    private EntityManagerFactory emf;
    private EntityManager em;
    
    @Override
    public void crearRegistro(Campeon campeon) {
        // esto tiene que eir rn todo los metodos
        inicializarsesion();
        em.getTransaction().begin();
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.persist(campeon);
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public void eliminarRegistro(Campeon campeon) {
        inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        campeon.setFechaEliminacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(campeon); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public void actualizarRegistro(Campeon campeon) {
        inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        campeon.setFechaActualizacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(campeon); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public List<Campeon> obtenerRegistros() {
        inicializarsesion();
        List<Campeon> listaCampeon = em
                .createQuery("SELECT j FROM Campeon j WHERE j.fechaEliminacion IS NULL")
                .getResultList();
        
        cerrarSesion();
        return listaCampeon;
    }

    @Override
    public Campeon obtenerRegistro(Long idCampeon) {
        inicializarsesion();
        Campeon campeon = em.find(Campeon.class, idCampeon); // retorna todo el registro de esa Id
        
        cerrarSesion();
        return campeon;
        
    }
     private void inicializarsesion(){
        emf = Persistence.createEntityManagerFactory("RolDeJuegosPU");
        em = emf.createEntityManager();
    }
    
    private void cerrarSesion(){
        em.close();
        emf.close();
    }   
}
