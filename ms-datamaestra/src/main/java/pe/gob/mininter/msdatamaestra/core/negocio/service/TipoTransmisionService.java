package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.TipoTransmision;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoTransmisionRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoTransmisionServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TipoTransmisionDto;

@Service
public class TipoTransmisionService implements TipoTransmisionServiceInterface{
	
	@Autowired
	private TipoTransmisionRepository tipoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<TipoTransmisionDto> list(){
		return null;		
	}
	
	@Override
	public TipoTransmisionDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public TipoTransmisionDto create(TipoTransmisionDto objectDto) {
		return null;
	}
	
	@Override
	public List<TipoTransmisionDto> getTipoTransmision(){
		TipoTransmisionDto tipoTransmisionDto;
		List<TipoTransmisionDto> TipoDto = new ArrayList<>();
		List<TipoTransmision> Transmisiones = tipoRepository.getTipoTransmision();
		for (TipoTransmision tipo : Transmisiones) {
			tipoTransmisionDto = new TipoTransmisionDto();
			mapper.map(tipo, tipoTransmisionDto);
			TipoDto.add(tipoTransmisionDto);
		}
		return TipoDto;
	}

}
