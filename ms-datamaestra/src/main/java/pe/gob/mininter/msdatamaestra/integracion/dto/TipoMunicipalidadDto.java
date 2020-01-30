package pe.gob.mininter.msdatamaestra.integracion.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Tipo de Municipalidades", description = "Información del tipo de Municipalidades")
public class TipoMunicipalidadDto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("idTipoMunicipalidad")
	@ApiModelProperty(notes = "Identificador del Tipo de Municipalidades")
	private String id;
	
	@NotNull
	@Mapping("nombre")
	@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Tipo de Municipalidades", required = true)
	private String nombre;
	
	@NotNull
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("estado")
	@ApiModelProperty(notes = "Estado del tipo de Municipalidades ")
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
