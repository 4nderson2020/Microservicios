package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.DivisionPolicial;

public interface DivisionPolicialRepository extends JpaRepository<DivisionPolicial,Integer>{
	
	@Query(value="select id,id_tm_region_policial,id_tm_macro_region,nombre,estado,usuario_creacion,usuario_modificacion,fecha_creacion,fecha_modificacion,ip_creacion,ip_modificacion \r\n" + 
			"from sisdatamaestrami.tm_division_policial\r\n" + 
			"where estado = 1 and id_tm_region_policial = :idMacro and id_tm_macro_region = :idRegion\r\n" + 
			"order by id asc",nativeQuery = true)
	
	List<DivisionPolicial> getDivisionPolicial(@Param("idMacro")Integer idMacro,@Param("idRegion")Integer idRegion);

}
