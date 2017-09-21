package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.mx.uaz.mobileTracking.model.EdificioHistorico;
import com.mx.uaz.mobileTracking.model.Usuario;
import com.mx.uaz.mobileTracking.model.Visita;
import com.mx.uaz.mobileTracking.service.EdificioHistoricoService;
import com.mx.uaz.mobileTracking.service.UsuarioService;
import com.mx.uaz.mobileTracking.service.VisitaService;

public class VisitasBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private VisitaService visitaService;
	private EdificioHistoricoService edificioHistoricoService;
	private UsuarioService usuarioService;
	private Visita visita;
	private Integer idUsuario;
	private Integer idEdificioHistorico;
	private List<Visita> visitas;
	private List<SelectItem> listUsuarios = new ArrayList<SelectItem>();
	private List<SelectItem> listEdificiosHistoricos = new ArrayList<SelectItem>();
	
	public VisitasBean(){
		visita = new Visita();
	}
	
	public void finalize() throws Throwable {}
	
	public void buscar(){
		System.out.println("buscar");
		visita = new Visita();
		visita.setEdificioHistorico(edificioHistoricoService.buscar(idEdificioHistorico));
		System.out.println("Edificio Historico = " + visita.getEdificioHistorico());
		visita.setUsuario(usuarioService.buscar(idUsuario));
		System.out.println("Usuario = "+ visita.getUsuario());
		visitas = visitaService.buscar(visita);
	}
	
	public String llenarTabla(){
		System.out.println("llenar tabla");
		visita = new Visita();
		visitas = visitaService.buscar(visita);
		return "visitas";
	}
	
	public VisitaService getVisitaService() {
		return visitaService;
	}
	
	public void setVisitaService(VisitaService visitaService) {
		this.visitaService = visitaService;
	}
	
	public EdificioHistoricoService getEdificioHistoricoService() {
		return edificioHistoricoService;
	}

	public void setEdificioHistoricoService(EdificioHistoricoService edificioHistoricoService) {
		this.edificioHistoricoService = edificioHistoricoService;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Visita getVisita() {
		System.out.println("get visitas");
		return visita;
	}
	
	public void setVisita(Visita visita) {
		this.visita = visita;
	}
	
	public List<Visita> getVisitas() {
		return visitas;
	}
	
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

	public List<SelectItem> getListUsuarios() {
		List<Usuario> usuarios = usuarioService.buscar(new Usuario());
		listUsuarios = new ArrayList<SelectItem>();
		for(Usuario usuario: usuarios){
			SelectItem selectItem = new SelectItem(usuario.getIdUsuario(), usuario.getCorreo());
			listUsuarios.add(selectItem);
		}
		return listUsuarios;
	}

	public void setListUsuarios(List<SelectItem> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}

	public List<SelectItem> getListEdificiosHistoricos() {
		List<EdificioHistorico> edificiosHistoricos = edificioHistoricoService.buscar(new EdificioHistorico());
		listEdificiosHistoricos = new ArrayList<SelectItem>();
		for(EdificioHistorico edificioHistorico: edificiosHistoricos){
			SelectItem selectItem = new SelectItem(edificioHistorico.getIdEdificioHistorico(), edificioHistorico.getDescripcion());
			listEdificiosHistoricos.add(selectItem);
		}
		return listEdificiosHistoricos;
	}

	public void setListEdificiosHistoricos(List<SelectItem> listEdificiosHistoricos) {
		this.listEdificiosHistoricos = listEdificiosHistoricos;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdEdificioHistorico() {
		return idEdificioHistorico;
	}

	public void setIdEdificioHistorico(Integer idEdificioHistorico) {
		this.idEdificioHistorico = idEdificioHistorico;
	}
	
}
