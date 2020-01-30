package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.TipoVehiculoDto;

public interface TipoVehiculoServiceInterface extends MaintenanceServiceInterface<TipoVehiculoDto,Integer>{
	
	List<TipoVehiculoDto> getTipoVehiculo();
}