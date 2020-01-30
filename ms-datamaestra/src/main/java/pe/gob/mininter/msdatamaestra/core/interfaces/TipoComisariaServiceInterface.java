package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.TipoComisariaDto;

public interface TipoComisariaServiceInterface extends MaintenanceServiceInterface<TipoComisariaDto,String> {
	
	List<TipoComisariaDto> getTipoComisaria();

}
