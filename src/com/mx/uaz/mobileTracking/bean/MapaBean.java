package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;
import java.util.List;

import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

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
	private Integer tamano;
	private String jSonEdHist = "";
	
	public MapaBean(){
		edificioHistorico = new EdificioHistorico();
		//edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
		//tamano = edificiosHistoricos.size();
		//System.out.println("Mapa Bean edificios = " + edificios.size());
	}
	
	public void finalize() throws Throwable {
	}
	
	public String llenarTabla(){
		edificioHistorico = new EdificioHistorico();
		edificiosHistoricos = edificioHistoricoService.buscar(edificioHistorico);
		tamano = edificiosHistoricos.size();
		JSONArray jsonArray = new JSONArray();		
		//jSonEdHist = jsonArray.toString();
		for(EdificioHistorico edHist: edificiosHistoricos){
			jsonArray.put(edHist);
		}		
		jSonEdHist = jsonArray.toString();
		String tem = "";
		for(int i=2; i< (jSonEdHist.length()-2); i++){
			tem = tem + jSonEdHist.charAt(i);
		}
		tem = tem.replace('"', ' ');
		jSonEdHist = tem;
		System.out.println(jSonEdHist);
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
		tamano = edificiosHistoricos.size();
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

	public Integer getTamano() {
		return tamano;
	}

	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	public String getjSonEdHist() {
		return jSonEdHist;
	}

	public void setjSonEdHist(String jSonEdHist) {
		this.jSonEdHist = jSonEdHist;
	}
	
}




