package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.RegionPolicial;

public interface RegionPolicialRepository extends JpaRepository<RegionPolicial, Integer>{
	
	@Query(value = "select reg.id,id_tm_macro_region,reg.nombre,reg.estado,reg.usuario_creacion,reg.usuario_modificacion,reg.fecha_creacion,reg.fecha_modificacion,reg.ip_creacion,reg.ip_modificacion from sisdatamaestrami.tm_region_policial reg\r\n" + 
			"inner join sisdatamaestrami.tm_macro_region macro on reg.id_tm_macro_region=macro.id\r\n" + 
			"where id_tm_macro_region = :idMacroregion\r\n" + 
			"order by reg.id asc", nativeQuery = true)
	
	List<RegionPolicial> getRegionPolicial(@Param("idMacroregion")Integer idMacroregion);

}
