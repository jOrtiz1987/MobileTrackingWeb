package com.mx.uaz.mobileTracking.bean;

public class LoginBean {
	
	private String usuario;
	private String password;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validarUsuario(){
		if(usuario.equals("administrador") && password.equals("mobileadmin")){
			System.out.println("login");
			return "entrar";
		}
		else{
			System.out.println("no login");
			return "no entrar";
		}
	}
	
	public String salir(){
		return "salir";
	}

}
