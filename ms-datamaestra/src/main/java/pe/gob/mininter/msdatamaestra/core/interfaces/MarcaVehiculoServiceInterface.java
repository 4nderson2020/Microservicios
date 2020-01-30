package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.MarcaVehiculoDto;

public interface MarcaVehiculoServiceInterface extends MaintenanceServiceInterface<MarcaVehiculoDto,Integer>{
	
	List<MarcaVehiculoDto> getMarcaVehiculo();

}
