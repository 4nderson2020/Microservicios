package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.Departamento;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.DepartamentoRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.DepartamentoServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.DepartamentoDto;

@Service
public class DepartamentoService implements DepartamentoServiceInterface{

	@Autowired
	private DepartamentoRepository dptoRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<DepartamentoDto> list(){
		return null;		
	}
	
	@Override
	public DepartamentoDto findOne(String id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public DepartamentoDto create(DepartamentoDto objectDto) {
		return null;
	}
	
	@Override
	public List<DepartamentoDto> getDepartamento(){
		DepartamentoDto depDto;
		List<DepartamentoDto> departamentosDto = new ArrayList<>();
		List<Departamento> Departamentos = dptoRepository.getDepartamento();
		for (Departamento dep : Departamentos) {
			depDto = new DepartamentoDto();
			mapper.map(dep, depDto);
			departamentosDto.add(depDto);
		}
		return departamentosDto;
	}
	
}
