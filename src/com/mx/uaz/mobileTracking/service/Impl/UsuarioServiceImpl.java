package com.mx.uaz.mobileTracking.service.Impl;

import java.util.List;

import com.mx.uaz.mobileTracking.DAO.UsuarioDAO;
import com.mx.uaz.mobileTracking.model.Usuario;
import com.mx.uaz.mobileTracking.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDAO usuarioDAO;
	
	@Override
	public boolean insertarModificar(Usuario usuario) {
		return usuarioDAO.insertarModificar(usuario);
	}

	@Override
	public boolean eliminar(Usuario usuario) {
		return usuarioDAO.eliminar(usuario);
	}

	@Override
	public Usuario buscar(Integer id) {
		return usuarioDAO.buscar(id);
	}

	@Override
	public List<Usuario> buscar(Usuario usuario) {
		return usuarioDAO.buscar(usuario);
	}

	@Override
	public List<Usuario> buscar(String consulta) {
		return usuarioDAO.buscar(consulta);
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
