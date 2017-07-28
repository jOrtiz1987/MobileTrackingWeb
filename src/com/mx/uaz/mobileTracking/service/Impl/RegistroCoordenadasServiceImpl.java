package com.mx.uaz.mobileTracking.service.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.RegistroCoordenadasDAO;
import com.mx.uaz.mobileTracking.model.RegistroCoordendas;
import com.mx.uaz.mobileTracking.service.RegistroCoordenadasService;

public class RegistroCoordenadasServiceImpl implements RegistroCoordenadasService {

	private RegistroCoordenadasDAO registroCoordenadasDAO;
	
	@Override
	public boolean insertarModificar(RegistroCoordendas registroCoordenadas) {
		return registroCoordenadasDAO.insertarModificar(registroCoordenadas);
	}

	@Override
	public boolean eliminar(RegistroCoordendas registroCoordenadas) {
		return registroCoordenadasDAO.eliminar(registroCoordenadas);
	}

	@Override
	public RegistroCoordendas buscar(Integer id) {
		return registroCoordenadasDAO.buscar(id);
	}

	@Override
	public List<RegistroCoordendas> buscar(RegistroCoordendas registroCoordenadas) {
		return registroCoordenadasDAO.buscar(registroCoordenadas);
	}

	@Override
	public List<RegistroCoordendas> buscar(String consulta) {
		return registroCoordenadasDAO.buscar(consulta);
	}

	public void setRegistroCoordenadasDAO(RegistroCoordenadasDAO registroCoordenadasDAO) {
		this.registroCoordenadasDAO = registroCoordenadasDAO;
	}

}
