package pe.gob.mininter.msdatamaestra.core.accesodato.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TM_PROVINCIA", schema = "sisdatamaestrami")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_PROVINCIA",length = 2)
	private String idProvincia;
	
	@ManyToOne
	@JoinColumn(name = "ID_TM_DEPARTAMENTO",nullable = false, foreignKey = @ForeignKey(name = "fk_provincia_departamento"))
	private Departamento departamento;
	
	@Column(name = "NOMBRE",length = 50)
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

	public String getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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

