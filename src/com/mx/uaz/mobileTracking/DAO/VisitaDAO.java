package com.mx.uaz.mobileTracking.DAO;

import java.util.List;

import com.mx.uaz.mobileTracking.model.Visita;

public interface VisitaDAO {

	public boolean insertarModificar(Visita visita);
	
	public boolean eliminar(Visita visita);
	
	public Visita buscar(Integer id);
	
	public List<Visita> buscarTodos(Visita visita);
	
	public List<Visita> buscar(Visita visita);
	
	public List<Visita> buscar(String consulta);
	
}
