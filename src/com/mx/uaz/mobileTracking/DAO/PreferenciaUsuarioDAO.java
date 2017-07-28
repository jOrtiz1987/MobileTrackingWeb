package com.mx.uaz.mobileTracking.DAO;

import java.util.List;

import com.mx.uaz.mobileTracking.model.PreferenciaUsuario;

public interface PreferenciaUsuarioDAO {

	public boolean insertarModificar(PreferenciaUsuario preferenciaUsuario);
	
	public boolean eliminar(PreferenciaUsuario preferenciaUsuario);
	
	public PreferenciaUsuario buscar(Integer id);
	
	public List<PreferenciaUsuario> buscar(PreferenciaUsuario preferenciaUsuario);
	
	public List<PreferenciaUsuario> buscar(String consulta);
	
}
