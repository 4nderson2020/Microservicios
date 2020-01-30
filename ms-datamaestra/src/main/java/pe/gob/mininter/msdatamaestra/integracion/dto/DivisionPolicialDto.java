package pe.gob.mininter.msdatamaestra.integracion.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Division Policial", description = "Información de las Divisiones Policiales")
public class DivisionPolicialDto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("idDivision")
	@ApiModelProperty(notes = "Identificador de la División Policial")
	private Integer id;
	
	@NotNull
	@Mapping("nombre")
	@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Nombre de la Division Policial", required = true)
	private String nombre;
	
	@NotNull
	@Mapping("estado")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Estado de la Division Policial", required = true)
	private Integer estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
