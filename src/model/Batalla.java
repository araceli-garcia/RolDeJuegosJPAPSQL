
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "batalla")
public class Batalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // agregar cantidad
    @Column(nullable = false)
    private int cantidad;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaCreacion;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEliminacion;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    
    @JoinColumn(name="jugadorId")
    private Jugador jugador;
   
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="campeonId")
    private Campeon campeon;
     
    
    
    
    public Batalla() {
        super();
    }

    public Batalla(int cantidad, Date fechaCreacion, Jugador jugador, Campeon campeon) {
        this.cantidad = cantidad;
        this.fechaCreacion = fechaCreacion;
        this.jugador = jugador;
        this.campeon = campeon;
    }

    

  
    
    public Long getId() {
        return id;
    }    

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Campeon getCampeon() {
        return campeon;
    }

    public void setCampeon(Campeon campeon) {
        this.campeon = campeon;
    }

    
}
