package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.TipoVehiculo;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoVehiculoRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoVehiculoServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TipoVehiculoDto;

@Service
public class TipoVehiculoService implements TipoVehiculoServiceInterface{
	
	@Autowired
	private TipoVehiculoRepository tipoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<TipoVehiculoDto> list(){
		return null;		
	}
	
	@Override
	public TipoVehiculoDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public TipoVehiculoDto create(TipoVehiculoDto objectDto) {
		return null;
	}
	
	@Override
	public List<TipoVehiculoDto> getTipoVehiculo(){
		TipoVehiculoDto tipoVehiculoDto;
		List<TipoVehiculoDto> TipoDto = new ArrayList<>();
		List<TipoVehiculo> tipoVehiculos = tipoRepository.getTipoVehiculo();
		for (TipoVehiculo tipo : tipoVehiculos) {
			tipoVehiculoDto = new TipoVehiculoDto();
			mapper.map(tipo, tipoVehiculoDto);
			TipoDto.add(tipoVehiculoDto);
		}
		return TipoDto;
	}

}
