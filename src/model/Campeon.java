
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "campeon")
public class Campeon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(nullable = false,length = 50)
    private String nombre;
    
    @Column(nullable = false)
    private int edad;
    
    @Lob
    @Column(nullable = false, length = 10)
    private String sexo;
    
    @Column(nullable = false)
    private int tipo;
    
    //
    private BigDecimal precio;
    
     @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date fechaCreacion;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEliminacion;
    
    @OneToMany(mappedBy = "campeon")
    
    private List<Batalla> batalla;

    public Campeon() {
    }

    public Campeon(String nombre, int edad, String sexo, int tipo, BigDecimal precio, Date fachaCracion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipo = tipo;
        this.precio = precio;
        this.fechaCreacion = fachaCracion;
    }
    
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
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

    public List<Batalla> getBatalla() {
        return batalla;
    }

    public void setBatalla(List<Batalla> batalla) {
        this.batalla = batalla;
    }

  

    
    
}
