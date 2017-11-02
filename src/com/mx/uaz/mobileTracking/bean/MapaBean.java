package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;
import java.util.List;

import com.mx.uaz.mobileTracking.model.EdificioHistorico;
import com.mx.uaz.mobileTracking.service.EdificioHistoricoService;

public class MapaBean implements Serializable{

	/**
	 * revisar 
	 * https://github.com/richfaces/richfaces
	 * https://developers.google.com/maps/documentation/javascript/adding-a-google-map?hl=es
	 * http://livedemo.exadel.com/richfaces-demo/richfaces/gmap.jsf?c=gmap
	 */
	private static final long serialVersionUID = 1L;
	//private String mapKey ="AIzaSyDgsBvMxxNkpkY2iNjyd-gn8Xqd1vRlDr0";
	private EdificioHistoricoService edificioHistoricoService;
	private EdificioHistorico edificioHistorico;
	private List<EdificioHistorico> edificiosHistoricos;
	
	public MapaBean(){
		edificioHistorico = new EdificioHistorico();
		//edificios = edificioHistoricoService.buscar(edificioHistorico);
		//System.out.println("Mapa Bean edificios = " + edificios.size());
	}
	
	public void finalize() throws Throwable {
	}
	

	public String llenarTabla(){
		edificioHistorico = new EdificioHistorico();
		edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
		//System.out.println("LlenarTabla edificios = " + edificios.size());
		return "mapa";
	}

	/*public String getMapKey() {
		return mapKey;
	}

	public void setMapKey(String mapKey) {
		this.mapKey = mapKey;
	}*/

	public List<EdificioHistorico> getEdificiosHistoricos() {
		edificioHistorico = new EdificioHistorico();
		edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
		//System.out.println("Get edificios = " + edificios.size());
		return edificiosHistoricos;
	}

	public void setEdificiosHistoricos(List<EdificioHistorico> edificiosHistoricos) {
		this.edificiosHistoricos = edificiosHistoricos;
	}

	public EdificioHistorico getEdificioHistorico() {
		return edificioHistorico;
	}

	public void setEdificioHistorico(EdificioHistorico edificioHistorico) {
		this.edificioHistorico = edificioHistorico;
	}

	public void setEdificioHistoricoService(EdificioHistoricoService edificioHistoricoService) {
		this.edificioHistoricoService = edificioHistoricoService;
	}
	
}




