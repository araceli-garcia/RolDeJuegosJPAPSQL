
package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Batalla;

public class BatallaDaoImpl implements BatallaDao{
private EntityManagerFactory emf;
    private EntityManager em;
    @Override
    public void crearRegistro(Batalla batalla) {
         // esto tiene que eir rn todo los metodos
        inicializarsesion();
        em.getTransaction().begin();
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.persist(batalla);
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public void eliminarRegistro(Batalla batalla) {
        inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        batalla.setFechaEliminacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(batalla); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public void actualizarRegistro(Batalla batalla) {
         inicializarsesion();
        em.getTransaction().begin();
        // setear la fecha de actualizacion
        batalla.setFechaActualizacion(new Date());
        // bloque de codigo del objeto
        
        
        /// bloque de codigo de cierre
        em.merge(batalla); // para actualizar
        em.getTransaction().commit();
        cerrarSesion();
    }

    @Override
    public List<Batalla> obtenerRegistros() {
        
        inicializarsesion();
        List<Batalla> listaBatalla = em
                .createQuery("SELECT b FROM Batalla b WHERE b.fechaEliminacion IS NULL")
                .getResultList();
        
        cerrarSesion();
        return listaBatalla;
    }

    @Override
    public Batalla obtenerRegistro(Long idBatalla) {
        inicializarsesion();
        Batalla batalla = em.find(Batalla.class, idBatalla); // retorna todo el registro de esa Id
        
        cerrarSesion();
        return batalla;
        
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
