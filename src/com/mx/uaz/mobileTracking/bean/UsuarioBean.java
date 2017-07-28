package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import com.mx.uaz.mobileTracking.model.Usuario;
import com.mx.uaz.mobileTracking.service.UsuarioService;

public class UsuarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioService usuarioService;
	private Usuario usuario;
	private List<Usuario> usuarios;
	
	public UsuarioBean(){
		usuario = new Usuario();
	}
	
	public void finalize() throws Throwable {
	}
	
	public String agregar(){
		try{
			usuarioService.insertarModificar(usuario);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			usuarios = usuarioService.buscar(usuario);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "";
	}

	public String imprimir(){
		return "";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		usuario = usuarioService.buscar(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idUsuarioM")));
		return inicioAgregar();
	}
	

	public String llenarTabla(){
		try{
			usuario = new Usuario();
			usuarios = usuarioService.buscar(usuario);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "usuarios";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		usuarioService.eliminar(usuarioService.buscar(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idUsuario"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		llenarTabla();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
