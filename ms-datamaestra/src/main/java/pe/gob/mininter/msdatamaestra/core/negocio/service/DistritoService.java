package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Distrito;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.DistritoRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.DistritoServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.DistritoDto;

@Service
public class DistritoService implements DistritoServiceInterface{
	
	@Autowired
	private DistritoRepository DistritoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<DistritoDto> list(){
		return null;
	}
	
	@Override
	public DistritoDto findOne(String id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public DistritoDto create(DistritoDto objectDto) {
		return null;
	}
	
	@Override
	public List<DistritoDto> getDistrito(String idDepartamento,String idProvincia){
		DistritoDto DistritoDto;
		List<DistritoDto> DistritosDto = new ArrayList<>();
		List<Distrito> Distritos = DistritoRepository.getDistrito(idDepartamento,idProvincia);
		
		for (Distrito Distrito : Distritos) {
			DistritoDto = new DistritoDto();
			mapper.map(Distrito, DistritoDto);
			DistritosDto.add(DistritoDto);
		}
		return DistritosDto;
	}

}