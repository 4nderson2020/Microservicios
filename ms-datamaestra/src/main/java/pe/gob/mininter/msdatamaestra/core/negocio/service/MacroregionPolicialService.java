package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.MacroregionPolicial;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.MacroregionPolicialRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.MacroregionPolicialServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.MacroregionPolicialDto;

@Service
public class MacroregionPolicialService implements MacroregionPolicialServiceInterface{
	
	@Autowired
	private MacroregionPolicialRepository macroregionRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<MacroregionPolicialDto> list(){
		return null;		
	}
	
	@Override
	public MacroregionPolicialDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public MacroregionPolicialDto create(MacroregionPolicialDto objectDto) {
		return null;
	}
	
	@Override
	public List<MacroregionPolicialDto> getMacroregionPolicial(){
		MacroregionPolicialDto MacroregionDto;
		List<MacroregionPolicialDto> MacroDto = new ArrayList<>();
		List<MacroregionPolicial> Macroregiones = macroregionRepository.getMacroregionPolicial();
		for (MacroregionPolicial Macroregion : Macroregiones) {
			MacroregionDto = new MacroregionPolicialDto();
			mapper.map(Macroregion, MacroregionDto);
			MacroDto.add(MacroregionDto);
		}
		return MacroDto;
	}

}
