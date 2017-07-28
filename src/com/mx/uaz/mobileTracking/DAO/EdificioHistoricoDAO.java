package com.mx.uaz.mobileTracking.DAO;

import java.util.List;

import com.mx.uaz.mobileTracking.model.EdificioHistorico;

public interface EdificioHistoricoDAO {

	public boolean insertarModificar(EdificioHistorico edificioHistorico);
	
	public boolean eliminar(EdificioHistorico edificioHistorico);
	
	public EdificioHistorico buscar(Integer id);
	
	public List<EdificioHistorico> buscar(EdificioHistorico edificioHistorico);
	
	public List<EdificioHistorico> buscar(String consulta);
	
}
