package pe.gob.mininter.msdatamaestra.integracion.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Distrito", description = "Información de los Distritos del Perú")
public class DistritoDto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("idDistrito")
	@ApiModelProperty(notes = "Ubigeo de Distrito")
	private String id;
	
	@NotNull
	@Mapping("nombre")
	@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Nombre del Distrito", required = true)
	private String nombre;
	
	@NotNull
	@Mapping("estado")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Estado del Distrito", required = true)
	private Integer estado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
