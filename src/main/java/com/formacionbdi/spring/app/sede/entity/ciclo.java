package com.formacionbdi.spring.app.sede.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_ciclo")
public class ciclo {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CICLO")
	private long ID_CICLO;
	@Column(name = "NU_CICLO")
	private String NU_CICLO; 
	@Column(name = "ID_DELEGADO")
	private long ID_DELEGADO; 
	@ManyToOne()
	@JoinColumn(name="ID_CI_ESCU")
	private escuela esc;
	public long getID_CICLO() {
		return ID_CICLO;
	}
	public void setID_CICLO(long iD_CICLO) {
		ID_CICLO = iD_CICLO;
	}
	public String getNU_CICLO() {
		return NU_CICLO;
	}
	public void setNU_CICLO(String nU_CICLO) {
		NU_CICLO = nU_CICLO;
	}
	public long getID_DELEGADO() {
		return ID_DELEGADO;
	}
	public void setID_DELEGADO(long iD_DELEGADO) {
		ID_DELEGADO = iD_DELEGADO;
	}
	public escuela getEsc() {
		return esc;
	}
	public void setEsc(escuela esc) {
		this.esc = esc;
	}
	
	

}
