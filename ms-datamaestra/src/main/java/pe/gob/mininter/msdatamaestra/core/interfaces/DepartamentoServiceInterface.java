package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.DepartamentoDto;

public interface DepartamentoServiceInterface extends MaintenanceServiceInterface<DepartamentoDto, String>{
	
	List<DepartamentoDto> getDepartamento();

}
