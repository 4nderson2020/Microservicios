package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.DistritoDto;

public interface DistritoServiceInterface extends MaintenanceServiceInterface<DistritoDto, String>{
	
	List<DistritoDto> getDistrito(String idDepartamento,String idProvincia);

}
