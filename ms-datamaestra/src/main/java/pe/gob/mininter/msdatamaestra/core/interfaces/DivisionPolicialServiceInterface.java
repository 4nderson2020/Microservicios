package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.DivisionPolicialDto;

public interface DivisionPolicialServiceInterface extends MaintenanceServiceInterface<DivisionPolicialDto,Integer>{
	
	List<DivisionPolicialDto> getDivisionPolicial(Integer idMacro,Integer idRegion);

}
