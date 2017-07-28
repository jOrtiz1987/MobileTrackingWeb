package com.mx.uaz.mobileTracking.service;

import java.util.List;

import com.mx.uaz.mobileTracking.model.Usuario;

public interface UsuarioService {

public boolean insertarModificar(Usuario usuario);
	
	public boolean eliminar(Usuario usuario);
	
	public Usuario buscar(Integer id);
	
	public List<Usuario> buscar(Usuario usuario);
	
	public List<Usuario> buscar(String consulta);
	
}
