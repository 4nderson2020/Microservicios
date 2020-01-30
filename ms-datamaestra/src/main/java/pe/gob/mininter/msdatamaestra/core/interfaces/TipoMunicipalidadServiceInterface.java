package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.TipoMunicipalidadDto;

public interface TipoMunicipalidadServiceInterface extends MaintenanceServiceInterface<TipoMunicipalidadDto,String>{
	
	List<TipoMunicipalidadDto> getTipoMunicipalidad();

}
