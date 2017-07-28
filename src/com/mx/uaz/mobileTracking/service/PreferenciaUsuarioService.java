package com.mx.uaz.mobileTracking.service;

import java.util.List;

import com.mx.uaz.mobileTracking.model.PreferenciaUsuario;

public interface PreferenciaUsuarioService {

public boolean insertarModificar(PreferenciaUsuario preferenciaUsuario);
	
	public boolean eliminar(PreferenciaUsuario preferenciaUsuario);
	
	public PreferenciaUsuario buscar(Integer id);
	
	public List<PreferenciaUsuario> buscar(PreferenciaUsuario preferenciaUsuario);
	
	public List<PreferenciaUsuario> buscar(String consulta);
	
}
