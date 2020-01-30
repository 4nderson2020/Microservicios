package pe.gob.mininter.msdatamaestra.core.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, String>{
	
	@Query(value = "select id_departamento, nombre, estado, usuario_creacion, usuario_modificacion, fecha_creacion, fecha_modificacion, ip_creacion, ip_modificacion  from sisdatamaestrami.tm_departamento where estado=1 order by id_departamento asc",
			nativeQuery = true)
	List<Departamento> getDepartamento();

}
