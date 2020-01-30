package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.ProvinciaDto;

public interface ProvinciaServiceInterface extends MaintenanceServiceInterface<ProvinciaDto, String>{
	
	List<ProvinciaDto> getProvincia(String idDepartamento);

}
