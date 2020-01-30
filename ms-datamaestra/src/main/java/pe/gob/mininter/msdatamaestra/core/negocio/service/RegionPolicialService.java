package pe.gob.mininter.msdatamaestra.core.negocio.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.mininter.msdatamaestra.core.accesodato.entity.RegionPolicial;
import pe.gob.mininter.msdatamaestra.core.exception.ResourceNotFoundException;
import pe.gob.mininter.msdatamaestra.core.interfaces.RegionPolicialRepository;
import pe.gob.mininter.msdatamaestra.core.interfaces.RegionPolicialServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.RegionPolicialDto;

@Service
public class RegionPolicialService implements RegionPolicialServiceInterface{
	
	@Autowired
	private RegionPolicialRepository regionRepository;
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<RegionPolicialDto> list(){
		return null;
	}
	
	@Override
	public RegionPolicialDto findOne(Integer id) throws ResourceNotFoundException{
		return null;
	}
	
	@Override
	public RegionPolicialDto create(RegionPolicialDto objectDto) {
		return null;
	}
	
	@Override
	public List<RegionPolicialDto> getRegionPolicial(Integer idMacroregion){
		RegionPolicialDto regionDto;
		List<RegionPolicialDto> RegionDto = new ArrayList<>();
		List<RegionPolicial> Regiones = regionRepository.getRegionPolicial(idMacroregion);
		
		for (RegionPolicial region : Regiones) {
			regionDto = new RegionPolicialDto();
			mapper.map(region, regionDto);
			RegionDto.add(regionDto);
		}
		return RegionDto;
	}

}
