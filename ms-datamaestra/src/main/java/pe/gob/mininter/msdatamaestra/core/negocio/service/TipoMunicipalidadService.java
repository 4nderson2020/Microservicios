package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.TipoMunicipalidad;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoMunicipalidadRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoMunicipalidadServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TipoMunicipalidadDto;

@Service
public class TipoMunicipalidadService implements TipoMunicipalidadServiceInterface{
	
	@Autowired
	private TipoMunicipalidadRepository tipoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<TipoMunicipalidadDto> list(){
		return null;		
	}
	
	@Override
	public TipoMunicipalidadDto findOne(String id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public TipoMunicipalidadDto create(TipoMunicipalidadDto objectDto) {
		return null;
	}
	
	@Override
	public List<TipoMunicipalidadDto> getTipoMunicipalidad(){
		TipoMunicipalidadDto tipoMunicipalidadDto;
		List<TipoMunicipalidadDto> TipoDto = new ArrayList<>();
		List<TipoMunicipalidad> Municipalidades = tipoRepository.getTipoMunicipalidad();
		for (TipoMunicipalidad tipo : Municipalidades) {
			tipoMunicipalidadDto = new TipoMunicipalidadDto();
			mapper.map(tipo, tipoMunicipalidadDto);
			TipoDto.add(tipoMunicipalidadDto);
		}
		return TipoDto;
	}
}
