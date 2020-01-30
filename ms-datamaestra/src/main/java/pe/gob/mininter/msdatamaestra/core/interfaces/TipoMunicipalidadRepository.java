package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.TipoMunicipalidad;

public interface TipoMunicipalidadRepository extends JpaRepository<TipoMunicipalidad,String>{
	
	@Query(value = "select id,nombre,estado,usuario_creacion,usuario_modificacion,fecha_creacion,fecha_modificacion,ip_creacion,ip_modificacion \r\n" + 
			"from sisdatamaestrami.tm_tipo_municipalidad\r\n" + 
			"order by id asc",nativeQuery = true)
	
	List<TipoMunicipalidad> getTipoMunicipalidad();

}
