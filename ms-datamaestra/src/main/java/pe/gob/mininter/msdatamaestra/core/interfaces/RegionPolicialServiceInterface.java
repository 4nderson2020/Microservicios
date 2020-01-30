package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import pe.gob.mininter.msdatamaestra.integracion.dto.RegionPolicialDto;

public interface RegionPolicialServiceInterface extends MaintenanceServiceInterface<RegionPolicialDto,Integer>{
	
	List<RegionPolicialDto> getRegionPolicial (Integer idMacroregion);

}
