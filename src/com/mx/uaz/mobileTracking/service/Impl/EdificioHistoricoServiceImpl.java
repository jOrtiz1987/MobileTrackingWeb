package com.mx.uaz.mobileTracking.service.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.EdificioHistoricoDAO;
import com.mx.uaz.mobileTracking.model.EdificioHistorico;
import com.mx.uaz.mobileTracking.service.EdificioHistoricoService;

public class EdificioHistoricoServiceImpl implements EdificioHistoricoService {

	private EdificioHistoricoDAO edificioHistoricoDAO;
	
	@Override
	public boolean insertarModificar(EdificioHistorico edificioHistorico) {
		return edificioHistoricoDAO.insertarModificar(edificioHistorico);
	}

	@Override
	public boolean eliminar(EdificioHistorico edificioHistorico) {
		return edificioHistoricoDAO.eliminar(edificioHistorico);
	}

	@Override
	public EdificioHistorico buscar(Integer id) {
		return edificioHistoricoDAO.buscar(id);
	}

	@Override
	public List<EdificioHistorico> buscar(EdificioHistorico edificioHistorico) {
		System.out.println("buscando en el Service");
		return edificioHistoricoDAO.buscar(edificioHistorico);
	}

	@Override
	public List<EdificioHistorico> buscar(String consulta) {
		return edificioHistoricoDAO.buscar(consulta);
	}

	public void setEdificioHistoricoDAO(EdificioHistoricoDAO edificioHistoricoDAO) {
		this.edificioHistoricoDAO = edificioHistoricoDAO;
	}

}
