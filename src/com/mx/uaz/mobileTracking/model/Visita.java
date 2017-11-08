package com.mx.uaz.mobileTracking.model;
// Generated 19/07/2017 02:04:06 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Visita generated by hbm2java
 */
@Entity
@Table(name = "visita")
public class Visita implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idVisita;
	private EdificioHistorico edificioHistorico;
	private Usuario usuario;
	private Date fecha;

	public Visita() {
	}

	public Visita(Integer idVisita, EdificioHistorico edificioHistorico, Usuario usuario, Date fecha) {
		this.idVisita = idVisita;
		this.edificioHistorico = edificioHistorico;
		this.usuario = usuario;
		this.fecha = fecha;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idVisita", unique = true, nullable = false)
	public Integer getIdVisita() {
		return this.idVisita;
	}

	public void setIdVisita(Integer idVisita) {
		this.idVisita = idVisita;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEdificioHistorico", nullable = false)
	public EdificioHistorico getEdificioHistorico() {
		return this.edificioHistorico;
	}

	public void setEdificioHistorico(EdificioHistorico edificioHistorico) {
		this.edificioHistorico = edificioHistorico;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuario", nullable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "fecha", nullable = false)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString(){
		return "[idEdificioHistorico=" + edificioHistorico.getIdEdificioHistorico()+ ", descripcion=" 
				+ edificioHistorico.getDescripcion() + ", latitud=" + edificioHistorico.getLatitud() 
				+ ", longitud=" + edificioHistorico.getLongitud() + ", imagen=" + edificioHistorico.getImagen() + "]";
	}
	
}
