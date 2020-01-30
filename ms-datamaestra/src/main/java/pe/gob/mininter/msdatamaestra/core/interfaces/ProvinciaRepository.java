package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, String> {

	@Query(value = "select id_provincia,id_tm_departamento, prov.nombre, prov.estado, prov.usuario_creacion, prov.usuario_modificacion, prov.fecha_creacion, prov.fecha_modificacion, prov.ip_creacion, prov.ip_modificacion  \r\n" + 
			"from sisdatamaestrami.tm_provincia prov\r\n" + 
			"inner join sisdatamaestrami.tm_departamento dpto on dpto.id_departamento = prov.id_tm_departamento\r\n" + 
			"where prov.estado = 1 and id_tm_departamento = :idDepartamento\r\n" + 
			"order by id_provincia asc",nativeQuery = true)
	List<Provincia> getProvincia(@Param("idDepartamento")String idDepartamento);
}
