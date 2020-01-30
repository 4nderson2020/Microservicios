package pe.gob.mininter.msdatamaestra.integracion.resources;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import pe.gob.mininter.msdatamaestra.core.interfaces.TipoComisariaServiceInterface;
import pe.gob.mininter.msdatamaestra.integracion.dto.TipoComisariaDto;

@CrossOrigin
@RestController
@RequestMapping("/")
@Api(value="Tipo de Comisarias")
public class TipoComisariaRestController {
	
	private static final Logger logger = LogManager.getLogger(TipoComisariaRestController.class);
	
	@Autowired
	private TipoComisariaServiceInterface tipoService;

	@ApiOperation(value = "Tipo de Comisarias", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Lista recuperada exitosamente"),
			@ApiResponse(code = 401, message = "No estas autorizado para ver este recurso"),
			@ApiResponse(code = 403, message = "Está prohibido acceder al recurso que estaba tratando de alcanzar"),
			@ApiResponse(code = 404, message = "No se encuentra el recurso que intentabas alcanzar") })
	@GetMapping("/tipocomisarias")
	public ResponseEntity<List<TipoComisariaDto>> getTipoComisaria() {
		logger.info("Ejecución del endpoint GET: /tipocomisarias");
		return new ResponseEntity<List<TipoComisariaDto>>(tipoService.getTipoComisaria(), HttpStatus.OK);
	}

}