package com.mx.uaz.mobileTracking.service;

import java.util.List;

import com.mx.uaz.mobileTracking.model.Visita;

public interface VisitaService {

public boolean insertarModificar(Visita visita);
	
	public boolean eliminar(Visita visita);
	
	public Visita buscar(Integer id);
	
	public List<Visita> buscarTodos(Visita visita);
	
	public List<Visita> buscar(Visita visita);
	
	public List<Visita> buscar(String consulta);
	
}
