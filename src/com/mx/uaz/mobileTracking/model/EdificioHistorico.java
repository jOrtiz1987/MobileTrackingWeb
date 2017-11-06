package com.mx.uaz.mobileTracking.model;
// Generated 19/07/2017 02:04:06 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Edificiohistorico generated by hbm2java
 */
@Entity
@Table(name = "edificiohistorico")
public class EdificioHistorico implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEdificioHistorico;
	private String descripcion;
	private Double latitud;
	private Double longitud;
	private String contenido;
	private byte[] imagen;

	public EdificioHistorico() {
	}

	public EdificioHistorico(Integer idEdificioHistorico, String descripcion, Double latitud, Double longitud) {
		this.idEdificioHistorico = idEdificioHistorico;
		this.descripcion = descripcion;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idEdificioHistorico", unique = true, nullable = false)
	public Integer getIdEdificioHistorico() {
		return this.idEdificioHistorico;
	}

	public void setIdEdificioHistorico(Integer idEdificioHistorico) {
		this.idEdificioHistorico = idEdificioHistorico;
	}

	public String getContenido(){
		return this.contenido;
	}
	
	@Column(name = "contenido", nullable = false, length = 300)
	public void setContenido(String contenido){
		this.contenido = contenido;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	@Column(name = "descripcion", nullable = false, length = 45)
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "latitud", nullable = false)
	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud", nullable = false)
	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Lob
	@Column(name = "imagen", nullable = false)
	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String toString(){
		return "[idEdificioHistorico=" + idEdificioHistorico + ", descripcion=" + descripcion + ", latitud="
	            + latitud + ", longitud=" + longitud + ", imagen=" + imagen + "]";
	}
	
}
