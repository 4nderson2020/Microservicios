package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Provincia;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.ProvinciaRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.ProvinciaServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.ProvinciaDto;

@Service
public class ProvinciaService implements ProvinciaServiceInterface{
	
	@Autowired
	private ProvinciaRepository provRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<ProvinciaDto> list(){
		return null;
	}
	
	@Override
	public ProvinciaDto findOne(String id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public ProvinciaDto create(ProvinciaDto objectDto) {
		return null;
	}
		
	@Override
	public List<ProvinciaDto> getProvincia(String idDepartamento){
		ProvinciaDto provDto;
		List<ProvinciaDto> provinciasDto = new ArrayList<>();
		List<Provincia> Provincias = provRepository.getProvincia(idDepartamento);
		
		for (Provincia prov : Provincias) {
			provDto = new ProvinciaDto();
			mapper.map(prov, provDto);
			provinciasDto.add(provDto);
		}
		return provinciasDto;
	}

}
