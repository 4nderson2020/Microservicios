package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.EstadoVehiculo;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.EstadoVehiculoRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.EstadoVehiculoServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.EstadoVehiculoDto;

@Service
public class EstadoVehiculoService implements EstadoVehiculoServiceInterface{
	
	@Autowired
	private EstadoVehiculoRepository estadoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<EstadoVehiculoDto> list(){
		return null;		
	}
	
	@Override
	public EstadoVehiculoDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public EstadoVehiculoDto create(EstadoVehiculoDto objectDto) {
		return null;
	}
	
	@Override
	public List<EstadoVehiculoDto> getEstadoVehiculo(){
		EstadoVehiculoDto estadoVehiculoDto;
		List<EstadoVehiculoDto> EstadoDto = new ArrayList<>();
		List<EstadoVehiculo> Estados = estadoRepository.getEstadoVehiculo();
		for (EstadoVehiculo estado : Estados) {
			estadoVehiculoDto = new EstadoVehiculoDto();
			mapper.map(estado, estadoVehiculoDto);
			EstadoDto.add(estadoVehiculoDto);
		}
		return EstadoDto;
	}

}
