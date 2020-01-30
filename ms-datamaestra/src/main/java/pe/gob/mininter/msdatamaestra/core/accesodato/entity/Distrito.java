package pe.gob.mininter.msdatamaestra.core.accesodato.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TM_DISTRITO",schema = "sisdatamaestrami")
public class Distrito implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_DISTRITO", length = 2)
	private String idDistrito;
		
	@JoinColumns({@JoinColumn(name = "ID_TM_DEPARTAMENTO", referencedColumnName = "ID_TM_DEPARTAMENTO"),
				  @JoinColumn(name = "ID_TM_PROVINCIA",referencedColumnName = "ID_PROVINCIA")})
	
	@ManyToOne
	private Provincia provincia;
	
	@Column(name = "NOMBRE", length = 50)
	private String nombre;
	
	@Column(name = "ESTADO")
	private Integer estado;
	
	@Column(name = "USUARIO_CREACION")
	private String usuarioCreacion;
	
	@Column(name = "USUARIO_MODIFICACION")
	private String usuarioModificacion;
	
	@Column(name = "FECHA_CREACION")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "FECHA_MODIFICACION")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "IP_CREACION",length = 20)
	private String ipCreacion;
	
	@Column(name = "IP_MODIFICACION",length = 20)
	private String ipModificacion;

	public String getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(String idDistrito) {
		this.idDistrito = idDistrito;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getIpCreacion() {
		return ipCreacion;
	}

	public void setIpCreacion(String ipCreacion) {
		this.ipCreacion = ipCreacion;
	}

	public String getIpModificacion() {
		return ipModificacion;
	}

	public void setIpModificacion(String ipModificacion) {
		this.ipModificacion = ipModificacion;
	}

	

	

}
