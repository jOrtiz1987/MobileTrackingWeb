package com.mx.uaz.mobileTracking.service;

import java.util.List;

import com.mx.uaz.mobileTracking.model.EdificioHistorico;

public interface EdificioHistoricoService {

public boolean insertarModificar(EdificioHistorico edificioHistorico);
	
	public boolean eliminar(EdificioHistorico edificioHistorico);
	
	public EdificioHistorico buscar(Integer id);
	
	public List<EdificioHistorico> buscar(EdificioHistorico edificioHistorico);
	
	public List<EdificioHistorico> buscar(String consulta);
	
}
