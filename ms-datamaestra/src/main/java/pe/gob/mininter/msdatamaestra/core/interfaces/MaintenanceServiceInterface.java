package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.io.Serializable;
import java.util.List;

import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;

public interface MaintenanceServiceInterface <M,ID extends Serializable>{
	
	List<M> list();
	
	M findOne(ID id) throws ResourceNotFoundException;
	
	M create(M objectDto);

}
