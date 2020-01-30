package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.MarcaVehiculo;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.MarcaVehiculoRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.MarcaVehiculoServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.MarcaVehiculoDto;

@Service
public class MarcaVehiculoService implements MarcaVehiculoServiceInterface{
	
	@Autowired
	private MarcaVehiculoRepository marcaRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<MarcaVehiculoDto> list(){
		return null;		
	}
	
	@Override
	public MarcaVehiculoDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public MarcaVehiculoDto create(MarcaVehiculoDto objectDto) {
		return null;
	}
	
	@Override
	public List<MarcaVehiculoDto> getMarcaVehiculo(){
		MarcaVehiculoDto marcaVehiculoDto;
		List<MarcaVehiculoDto> MarcaDto = new ArrayList<>();
		List<MarcaVehiculo> Marcas = marcaRepository.getMarcaVehiculo();
		for (MarcaVehiculo marca : Marcas) {
			marcaVehiculoDto = new MarcaVehiculoDto();
			mapper.map(marca, marcaVehiculoDto);
			MarcaDto.add(marcaVehiculoDto);
		}
		return MarcaDto;
	}

}
