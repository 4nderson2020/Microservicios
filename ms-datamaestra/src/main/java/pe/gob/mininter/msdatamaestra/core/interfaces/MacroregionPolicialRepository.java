package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.MacroregionPolicial;

public interface MacroregionPolicialRepository extends JpaRepository<MacroregionPolicial, Integer>{
	
	@Query(value = "select id,nombre,estado,usuario_creacion,usuario_modificacion,fecha_creacion,fecha_modificacion,ip_creacion,ip_modificacion from sisdatamaestrami.tm_macro_region order by id asc",nativeQuery = true)
	
	List<MacroregionPolicial> getMacroregionPolicial();

}
