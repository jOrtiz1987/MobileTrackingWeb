package com.mx.uaz.mobileTracking.webService;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
import com.mx.uaz.mobileTracking.model.EdificioHistorico;
import com.mx.uaz.mobileTracking.service.EdificioHistoricoService;  

@Path("/edificioHistorico") 
public class EdificioHistoricoWebService {
	
	private EdificioHistoricoService edificioHistoricoService;
	  
	@GET
	@Path("/edificios")
	@Produces(MediaType.TEXT_PLAIN)
	public String obtenerEdificios() {
		String mensaje = "Hola mundo ";
		mensaje = mensaje + edificioHistoricoService.buscar(new EdificioHistorico());
		return mensaje;
	}
	  
	public void setEdificioHistoricoService(EdificioHistoricoService edificioHistoricoService) {
		this.edificioHistoricoService = edificioHistoricoService;
	}
	  
}
