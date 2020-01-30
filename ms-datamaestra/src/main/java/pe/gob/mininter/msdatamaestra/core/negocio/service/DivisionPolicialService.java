package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.DivisionPolicial;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.DivisionPolicialRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.DivisionPolicialServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.DivisionPolicialDto;

@Service
public class DivisionPolicialService implements DivisionPolicialServiceInterface{
	
	@Autowired
	private DivisionPolicialRepository divisionRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<DivisionPolicialDto> list(){
		return null;
	}
	
	@Override
	public DivisionPolicialDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public DivisionPolicialDto create(DivisionPolicialDto objectDto) {
		return null;
	}
	
	@Override
	public List<DivisionPolicialDto> getDivisionPolicial(Integer idMacro,Integer idRegion){
		DivisionPolicialDto divisionDto;
		List<DivisionPolicialDto> DivisionDto = new ArrayList<>();
		List<DivisionPolicial> Divisiones = divisionRepository.getDivisionPolicial(idMacro,idRegion);
		
		for (DivisionPolicial division : Divisiones) {
			divisionDto = new DivisionPolicialDto();
			mapper.map(division, divisionDto);
			DivisionDto.add(divisionDto);
		}
		return DivisionDto;
	}

}