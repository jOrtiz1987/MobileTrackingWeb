package com.mx.uaz.mobileTracking.service.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.PreferenciaUsuarioDAO;
import com.mx.uaz.mobileTracking.model.PreferenciaUsuario;
import com.mx.uaz.mobileTracking.service.PreferenciaUsuarioService;

public class PreferenciaUsuarioServiceImpl implements PreferenciaUsuarioService {

	private PreferenciaUsuarioDAO preferenciaUsuarioDAO;
	
	@Override
	public boolean insertarModificar(PreferenciaUsuario preferenciaUsuario) {
		return preferenciaUsuarioDAO.insertarModificar(preferenciaUsuario);
	}

	@Override
	public boolean eliminar(PreferenciaUsuario preferenciaUsuario) {
		return preferenciaUsuarioDAO.eliminar(preferenciaUsuario);
	}

	@Override
	public PreferenciaUsuario buscar(Integer id) {
		return preferenciaUsuarioDAO.buscar(id);
	}

	@Override
	public List<PreferenciaUsuario> buscar(PreferenciaUsuario preferenciaUsuario) {
		return preferenciaUsuarioDAO.buscar(preferenciaUsuario);
	}

	@Override
	public List<PreferenciaUsuario> buscar(String consulta) {
		return preferenciaUsuarioDAO.buscar(consulta);
	}

	public void setPreferenciaUsuarioDAO(PreferenciaUsuarioDAO preferenciaUsuarioDAO) {
		this.preferenciaUsuarioDAO = preferenciaUsuarioDAO;
	}

}
