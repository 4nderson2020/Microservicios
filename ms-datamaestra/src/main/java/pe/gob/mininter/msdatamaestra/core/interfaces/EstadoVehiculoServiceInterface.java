package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.EstadoVehiculoDto;

public interface EstadoVehiculoServiceInterface extends MaintenanceServiceInterface<EstadoVehiculoDto,Integer>{
	
	List<EstadoVehiculoDto> getEstadoVehiculo();
}
