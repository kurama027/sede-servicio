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
@Table(name ="tax_sede")
public class sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SEDE")
	private long ID_SEDE; 
	@Column(name = "NO_SEDE")
	private String NO_SEDE;
	@ManyToOne()
	@JoinColumn(name="ID_SE_ENTI")
	private entidad ent;
	public long getID_SEDE() {
		return ID_SEDE;
	}
	public void setID_SEDE(long iD_SEDE) {
		ID_SEDE = iD_SEDE;
	}
	public String getNO_SEDE() {
		return NO_SEDE;
	}
	public void setNO_SEDE(String nO_SEDE) {
		NO_SEDE = nO_SEDE;
	}
	public entidad getEnt() {
		return ent;
	}
	public void setEnt(entidad ent) {
		this.ent = ent;
	}
	
	
}
