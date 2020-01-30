package pe.gob.mininter.msdatamaestra.integracion.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Macroregion Policial", description = "Información de las Macroregiones Policiales")
public class MacroregionPolicialDto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("idMacroregion")
	@ApiModelProperty(notes = "Identificador de la Macroregion Policial")
	private Integer id;
	
	@NotNull
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("nombre")
	@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
	@ApiModelProperty(notes = "Nombre de la Macroregion Policial")
	private String nombre;
	
	@NotNull
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("estado")
	@ApiModelProperty(notes = "Estado de la Macroregion Policial")
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
