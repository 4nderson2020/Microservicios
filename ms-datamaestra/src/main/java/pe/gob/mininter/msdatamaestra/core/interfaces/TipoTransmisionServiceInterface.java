package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.TipoTransmisionDto;

public interface TipoTransmisionServiceInterface extends MaintenanceServiceInterface<TipoTransmisionDto,Integer>{
	
	List<TipoTransmisionDto> getTipoTransmision();

}
