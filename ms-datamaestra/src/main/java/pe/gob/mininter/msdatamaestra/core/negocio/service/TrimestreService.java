package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Trimestre;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.TrimestreRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.TrimestreServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TrimestreDto;

@Service
public class TrimestreService implements TrimestreServiceInterface{
	
	@Autowired
	private TrimestreRepository trimestreRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<TrimestreDto> list(){
		return null;		
	}
	
	@Override
	public TrimestreDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public TrimestreDto create(TrimestreDto objectDto) {
		return null;
	}
	
	@Override
	public List<TrimestreDto> getTrimestre(){
		TrimestreDto trimestreDto;
		List<TrimestreDto> TrimestreDto = new ArrayList<>();
		List<Trimestre> Trimestres = trimestreRepository.getTrimestre();
		for (Trimestre trimestre : Trimestres) {
			trimestreDto = new TrimestreDto();
			mapper.map(trimestre, trimestreDto);
			TrimestreDto.add(trimestreDto);
		}
		return TrimestreDto;
	}

}
