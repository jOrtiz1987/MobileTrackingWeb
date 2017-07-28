package com.mx.uaz.mobileTracking.bean;

import java.io.Serializable;

public class MapaBean implements Serializable{

	/**
	 * revisar 
	 * https://github.com/richfaces/richfaces
	 * https://developers.google.com/maps/documentation/javascript/adding-a-google-map?hl=es
	 * http://livedemo.exadel.com/richfaces-demo/richfaces/gmap.jsf?c=gmap
	 */
	private static final long serialVersionUID = 1L;
	private String mapKey ="AIzaSyDgsBvMxxNkpkY2iNjyd-gn8Xqd1vRlDr0";
	
	public MapaBean(){
		
	}
	
	public void finalize() throws Throwable {
	}
	

	public String llenarTabla(){
		return "mapa";
	}

	public String getMapKey() {
		return mapKey;
	}

	public void setMapKey(String mapKey) {
		this.mapKey = mapKey;
	}
	
	
	
}
