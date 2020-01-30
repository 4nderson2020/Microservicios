package pe.gob.mininter.msdatamaestra.integracion.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.dozer.Mapping;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Tipo de Vehiculo", description = "Información del estado del Vehículo")
public class TipoVehiculoDto {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("idTipoVehiculo")
	@ApiModelProperty(notes = "Identificador del Tipo de Vehiculo")
	private Integer id;
	
	@NotNull
	@Mapping("nombre")
	@Size(min = 3, message = "El nombre debe tener al menos 3 caracteres")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@ApiModelProperty(notes = "Nombre del tipo de vehiculo", required = true)
	private String nombre;
	
	@NotNull
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Mapping("estado")
	@ApiModelProperty(notes = "Estado del Tipo de Vehiculo ")
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
