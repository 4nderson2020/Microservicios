package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.MacroregionPolicialDto;

public interface MacroregionPolicialServiceInterface extends MaintenanceServiceInterface<MacroregionPolicialDto,Integer>{
	
	List<MacroregionPolicialDto> getMacroregionPolicial();

}
