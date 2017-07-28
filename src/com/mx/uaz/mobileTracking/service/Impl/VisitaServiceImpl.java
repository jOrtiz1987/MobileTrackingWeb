package com.mx.uaz.mobileTracking.service.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.VisitaDAO;
import com.mx.uaz.mobileTracking.model.Visita;
import com.mx.uaz.mobileTracking.service.VisitaService;

public class VisitaServiceImpl implements VisitaService {

	private VisitaDAO visitaDAO;
	
	@Override
	public boolean insertarModificar(Visita visita) {
		return visitaDAO.insertarModificar(visita);
	}

	@Override
	public boolean eliminar(Visita visita) {
		return visitaDAO.eliminar(visita);
	}

	@Override
	public Visita buscar(Integer id) {
		return visitaDAO.buscar(id);
	}

	@Override
	public List<Visita> buscar(Visita visita) {
		return visitaDAO.buscar(visita);
	}

	@Override
	public List<Visita> buscar(String consulta) {
		return visitaDAO.buscar(consulta);
	}

	public void setVisitaDAO(VisitaDAO visitaDAO) {
		this.visitaDAO = visitaDAO;
	}

}
