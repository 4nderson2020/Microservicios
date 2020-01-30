package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Distrito;

public interface DistritoRepository extends JpaRepository<Distrito,String>{
	
	@Query(value = "select id_distrito,id_tm_provincia, id_tm_departamento, nombre, estado, usuario_creacion, usuario_modificacion, fecha_creacion,fecha_modificacion, ip_creacion, ip_modificacion  \r\n" + 
			"			from sisdatamaestrami.tm_distrito  where estado=1 and id_tm_departamento = :idDepartamento and id_tm_provincia = :idProvincia",nativeQuery = true)
	List<Distrito> getDistrito(@Param("idDepartamento")String idDepartamento,@Param("idProvincia")String idProvincia);
	
}
