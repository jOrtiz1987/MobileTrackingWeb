package com.mx.uaz.mobileTracking.service;

import java.util.List;

import com.mx.uaz.mobileTracking.model.RegistroCoordendas;

public interface RegistroCoordenadasService {

public boolean insertarModificar(RegistroCoordendas registroCoordenadas);
	
	public boolean eliminar(RegistroCoordendas registroCoordenadas);
	
	public RegistroCoordendas buscar(Integer id);
	
	public List<RegistroCoordendas> buscar(RegistroCoordendas registroCoordenadas);
	
	public List<RegistroCoordendas> buscar(String consulta);
	
}
