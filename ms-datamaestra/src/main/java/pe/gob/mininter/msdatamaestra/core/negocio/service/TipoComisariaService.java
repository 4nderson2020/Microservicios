package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.TipoComisaria;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoComisariaRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoComisariaServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TipoComisariaDto;

@Service
public class TipoComisariaService implements TipoComisariaServiceInterface{
	
	@Autowired
	private TipoComisariaRepository tipoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<TipoComisariaDto> list(){
		return null;		
	}
	
	@Override
	public TipoComisariaDto findOne(String id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public TipoComisariaDto create(TipoComisariaDto objectDto) {
		return null;
	}
	
	@Override
	public List<TipoComisariaDto> getTipoComisaria(){
		TipoComisariaDto tipoComisariaDto;
		List<TipoComisariaDto> TipoDto = new ArrayList<>();
		List<TipoComisaria> Comisarias = tipoRepository.getTipoComisaria();
		for (TipoComisaria tipo : Comisarias) {
			tipoComisariaDto = new TipoComisariaDto();
			mapper.map(tipo, tipoComisariaDto);
			TipoDto.add(tipoComisariaDto);
		}
		return TipoDto;
	}
}