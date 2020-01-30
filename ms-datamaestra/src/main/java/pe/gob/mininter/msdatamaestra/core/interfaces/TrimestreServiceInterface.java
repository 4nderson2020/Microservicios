package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.TrimestreDto;

public interface TrimestreServiceInterface extends MaintenanceServiceInterface<TrimestreDto,Integer>{
	
	List<TrimestreDto> getTrimestre();
}
