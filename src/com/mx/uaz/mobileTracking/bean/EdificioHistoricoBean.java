package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import com.mx.uaz.mobileTracking.model.EdificioHistorico;
import com.mx.uaz.mobileTracking.service.EdificioHistoricoService;

public class EdificioHistoricoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EdificioHistoricoService edificioHistoricoService;
	private EdificioHistorico edificioHistorico;
	private List<EdificioHistorico> edificiosHistoricos;
	
	public EdificioHistoricoBean(){
		edificioHistorico = new EdificioHistorico();
	}
	
	public void finalize() throws Throwable {
	}
	
	public String agregar(){
		try{
			edificioHistoricoService.insertarModificar(edificioHistorico);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
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
		edificioHistorico = edificioHistoricoService.buscar(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEdificioHistoricoM")));
		return inicioAgregar();
	}
	

	public String llenarTabla(){
		try{
			edificioHistorico = new EdificioHistorico();
			edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "edificios";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		edificioHistoricoService.eliminar(edificioHistoricoService.buscar(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEdificioHistorico"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}
	
	public void setEdificioHistoricoService(EdificioHistoricoService edificioHistoricoService) {
		this.edificioHistoricoService = edificioHistoricoService;
	}
	
	public EdificioHistorico getEdificioHistorico() {
		return edificioHistorico;
	}
	
	public void setEdificioHistorico(EdificioHistorico edificioHistorico) {
		this.edificioHistorico = edificioHistorico;
	}

	public List<EdificioHistorico> getEdificiosHistoricos() {
		llenarTabla();
		return edificiosHistoricos;
	}

	public void setEdificiosHistoricos(List<EdificioHistorico> edificiosHistoricos) {
		this.edificiosHistoricos = edificiosHistoricos;
	}
	
	
	
}
